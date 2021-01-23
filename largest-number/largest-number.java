class Solution {
    public String largestNumber(int[] nums) {
        
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        
       Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                String s1 = i+j;
                String s2 = j+i;
                return s2.compareTo(s1);
            }
        });
        
        String res = String.join("", strs);
        
        if (res.isEmpty() || res.charAt(0) == '0') {
            return "0";
        }
        
        return res;
    }
}
