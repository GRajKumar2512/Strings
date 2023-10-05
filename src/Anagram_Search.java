public class Anagram_Search {
    //QUESTION: Check if the pattern or any of its permutations is present in the text string
    final static int CHAR = 256;
    public static boolean isPresent(String text, String pattern){
        int[] CT = new int[CHAR];
        int[] CP = new int[CHAR];

        for(int i = 0; i < pattern.length(); i++){
            CT[text.charAt(i)]++;
            CP[pattern.charAt(i)]++;
        }

        for(int i = pattern.length(); i < text.length(); i++){
            if(areSame(CT, CP)) return true;

            // if not found then, slide the window in text

            // increase the next new letter frequency of text
            CT[text.charAt(i)]++;
            // decrease the previous first letter frequency of text
            CT[text.charAt(i - pattern.length())]--;
        }
        return false;
    }

    public static boolean areSame(int[] CT, int[] CP){
        boolean flag = true;

        // check if both values of array are same
        for(int i = 0; i < CT.length; i++){
            if(CT[i] != CP[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "frog";
        System.out.println(isPresent(text, pattern));
    }
}
