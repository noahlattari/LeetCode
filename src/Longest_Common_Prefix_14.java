public class Longest_Common_Prefix_14 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length == 0) return "";

            StringBuilder sb = new StringBuilder();
            String first = strs[0];

            for(int i = 0; i < first.length(); i++){
                for(int j = 1; j < strs.length; j++){
                    if(i >= strs[j].length() || first.charAt(i) != strs[j].charAt(i)){
                        return sb.toString();
                    }
                }
                sb.append(first.charAt(i));
            }

            return sb.toString();
        }
    }
}
