import java.util.Arrays;

public class Leftmost_Repeating_Character {
    final static int CHAR = 256;
    public static int leftRepeatingChar(String test){
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);

        int res = Integer.MAX_VALUE;
        for(int i = 0; i < test.length();  i++){
            int f1 = fIndex[test.charAt(i)];

            // if -1 replace with index of the character
            if(f1 == -1) fIndex[test.charAt(i)] = i;

            // else replace with the lowest index character
            else res = Math.min(res, f1);
        }
        return (res == Integer.MAX_VALUE) ? -1 : res ;
    }
    public static void main(String[] args) {
        String test = "abccbd";
        System.out.println(leftRepeatingChar(test));
    }
}
