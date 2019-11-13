public class Longest_Common_Prefix_14 {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        if(strs == null || strs.length == 0){
            return longestCommonPrefix;
        }

        //is the first char the same? is the second the same?

        //int index = 0;
        char[] chars = strs[0].toCharArray();
        for(int j = 0; j < chars.length; j++){
            for(int i = 1; i < strs.length; i++){
                if(j >= strs[i].length() || chars[j] != strs[i].charAt(j)){
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix += chars[j];
            // index++;
        }
        return longestCommonPrefix;


    }
}
