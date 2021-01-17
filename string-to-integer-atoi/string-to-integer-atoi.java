class Solution {
    public int myAtoi(String str) {
        if(str.isEmpty() || str == null){
            return 0;
        }
        int sign = 1, i = 0, n = str.length();
        
        //white spaces
        while(i < n && str.charAt(i) == ' '){
            i++;
            if(i >= n){
                return 0;
            }
            
        }
        //check sign
       if(str.charAt(i) == '-' || str.charAt(i) == '+'){
           // sign = str.charAt(i++) == '+' ? 1 : -1;
           if(str.charAt(i) == '-'){
               sign = -1;
               i++;
           }else{
               sign = 1;
               i++;
           }
        }
        
        //build integer using horners rule
        long res = 0;
        while(i < n && Character.isDigit(str.charAt(i))){
            res = res * 10 + (str.charAt(i++) - '0');
            if(res * sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(res * sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int) (res * sign);
    }
}
