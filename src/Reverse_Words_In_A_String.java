public class Reverse_Words_In_A_String {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length -1; i >= 0; i--){
            //skil the empty spaces
            if(arr[i].equals("")){
                continue;
            }
            //add a space after every string except the last one
            if(i != arr.length -1){
                sb.append(" ");
            }
            //add string to the string
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
