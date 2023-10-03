import java.util.Arrays;

public class Leftmost_NonRepeating_Character {
    static final int CHAR = 256;
    public static int leftNonRepeatingChar(String test){
        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);

        for(int i = 0; i < test.length();  i++) {
            int f1 = fIndex[test.charAt(i)];

            // if -1 replace with index of the character
            if (f1 == -1) fIndex[test.charAt(i)] = i;

                // else replace with -2
            else fIndex[test.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < CHAR; i++){
            if(fIndex[i] >= 0){
                res = Math.min(res, fIndex[i]);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
    public static void main(String[] args) {
        String test = "abbcbda";
        System.out.println(leftNonRepeatingChar(test));
    }
}
