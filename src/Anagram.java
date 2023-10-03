public class Anagram {
    static final int CHAR = 256;
    public static  boolean anagram(String str1, String str2){
        if(str1.length() != str2.length()) return  false;

        int[] count = new int[CHAR];

        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for(int i = 0; i < CHAR; i++){
            if(count[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(anagram(str1, str2));
    }
}
