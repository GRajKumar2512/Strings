public class Subsequence_String {
    // Question: Check whether a string is subsequence of other string
    public static boolean checkSubseqIterative(String primary, String secondary){
        int i = 0, j = 0;
        int n = primary.length(), m = secondary.length();

        // basic input check
        if(n < m) return false;

        while(i < n && j < m){
            if(primary.charAt(i) == secondary.charAt(j)){
                i++; j++;
            }
            else {
                i++;
            }
        }

        // when "i" reaches the end of primary but "j" doesn't reach the end of secondary
        return (j == m);
    }

    public static boolean checkSubseqRecursive(String str1, String str2, int n, int m){
        if(m == 0) return true;
        if(n == 0) return false;

        if(str1.charAt(n) == str2.charAt(m)){
            return checkSubseqRecursive(str1, str2, n-1, m-1);
        } else {
            return checkSubseqRecursive(str1, str2, n - 1, m);
        }
    }

    public static void main(String[] args){
        String str1 = "GEEKSFORGEEKS";
        String str2 = "GRGES";
        System.out.println(checkSubseqIterative(str1, str2));
        System.out.println(checkSubseqRecursive(str1, str2, str1.length() - 1 , str2.length() - 1));
    }
}
