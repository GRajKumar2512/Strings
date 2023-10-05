import java.util.Arrays;

public class Longest_Substring {
    // QUESTION: find the longest distinct substring in the following given string
    static final int CHAR = 256;
    static int longestDist(String text){
        int[] prev_index = new int[CHAR];
        int res = 0;
        Arrays.fill(prev_index,  -1);

        int window_starting_index = 0;
        for(int j = 0; j < text.length(); j++){
            // compare previous starting index of window with the previous index of current letter
            window_starting_index = Math.max(window_starting_index, prev_index[text.charAt(j)]+ 1);

            // compute the window size with distinct substring
            int maxEnd = j - window_starting_index + 1;

            // store the result with the maximum index
            res = Math.max(res , maxEnd);

            // store the previous index in the array
            prev_index[text.charAt(j)] = j;
        }
        return res;
    }

    public static void main(String[] args){
        String test = "geeksforgeeks";
        System.out.println(longestDist(test));
    }

}
