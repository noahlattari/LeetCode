public class Reverse_String_344 {

    public static void main(String[] args) {

        char[] array = { 'h', 'e', 'l', 'l', 'o'};
        reverseString(array);
    }

    public static void reverseString(char[] s){
        //Switch the first and the last character, until meeting in the middle
        for(int i = 0; i < s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length -i -1];   //-i because it needs to keep moving to the left, kinda like two pointers
            s[s.length -i -1] = temp;
        }
        for (int i =0; i < s.length; i++){
            System.out.println(s[i]);
        }


    }

}
