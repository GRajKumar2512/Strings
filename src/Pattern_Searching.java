public class Pattern_Searching {
    public static void patternIndex(String primary, String secondary){
        int n = primary.length();
        int m = secondary.length();

        for(int i = 0; i < n; ){
            int j;
            for(j = 0; j < m; j++){
                if(secondary.charAt(j) != primary.charAt(i + j)) {
                    break;
                }
            }
            if(j == m) {
                // if j completed the loop, it means the pattern was found at "i" index
                System.out.print(i + " ");
            }


            if(j == 0){
                // if j was 0 when it breaks the loop, then increment the "i" index
                i++;
            } else {
                // if at some other point in between the letters of secondary were mismatched then simply slip the whole traced "j" index.
                i = (i + j);
            }
        }
    }
    public static void main(String[] args){
        String test = "geeksforgeeks";
        String pattern = "eks";
        patternIndex(test, pattern);
    }
}
