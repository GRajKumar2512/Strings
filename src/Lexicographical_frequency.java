
public class Lexicographical_frequency {
    // Question: Print frequencies characters (in sorted order) in a string of lower case alphabets.
    public static void main(String[] args) {
        // time complexity: O(n) Auxiliary space: O(1)

        String str = "geeksforgeeks";
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++){
            //access the array index of the character using its ascii value
            count[(int)str.charAt(i) - 97]++;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                System.out.print((char)(i + 97) +" = " + count[i] +", ");
            }
        }
    }
}
