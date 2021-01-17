class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        if(needle == null || haystack == null) return -1;
       // if(needle.length() > haystack.length()) return -1;
        for(int i = 0; i < haystack.length() - needle.length() +1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int count = 0;
                while(count < needle.length() && haystack.charAt(i+count) == needle.charAt(count)){
                    count++;
                }
                if(count == needle.length()){
                    return i;
                }
            }
        }
        
        
        return -1;
    }
}
