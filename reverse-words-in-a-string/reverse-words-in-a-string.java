class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length -1; i >= 0; i--){
            if(arr[i].equals("")){
                continue;
            }
            if(i != arr.length -1){
                sb.append(" ");
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
