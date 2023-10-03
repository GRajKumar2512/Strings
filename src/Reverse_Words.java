public class Reverse_Words {
    public static String revWords(char[] str){

        int start = 0;
        for(int end = 0; end < str.length; end++){
            if(str[end] == ' '){
                // reverse each of the words individually
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        // reverse the last word
        reverse(str, start, str.length - 1);

        // reverse the whole array all together
        reverse(str, 0, str.length - 1);

        // convert the char array to string and return
        return new String(str);
    }

    public static void reverse(char[] str,int start,int end){
        while(start <= end){
            // swap
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            // mutation
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        String test = "I love you India";
        char[] str = test.toCharArray();

        System.out.println(revWords(str));
    }
}
