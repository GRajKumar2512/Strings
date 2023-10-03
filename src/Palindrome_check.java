public class Palindrome_check {
    public static boolean isPalindrome(String str){
        // time complexity: O(n) and Auxiliary space: O(1)
        int begin = 0;
        int end = str.length() - 1;
        while(begin < end){
            if(str.charAt(begin) != str.charAt(end))
                return false;
            begin++; end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "ABCBA";
        String str2 = "GEEKS";
        String str3 = "ABBA";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
}
