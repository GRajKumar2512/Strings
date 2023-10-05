public class Rotations_String {
    public static boolean areRotations(String text, String input){
        if(text.length() != input.length()) return false;

        // we concat the main string with itself and then check if the other string is present or not.
        return (text + text).contains(input);
    }
    public static void main(String[] args){
        String text = "ABCD";
        String input = "CDAB";
        System.out.println(areRotations(text, input));

        String text1 = "ABAB";
        String input1 = "ABBA";
        System.out.println(areRotations(text1, input1));
    }
}
