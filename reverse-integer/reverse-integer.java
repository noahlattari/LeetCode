class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x < 0){
            x *= -1;
            negative = true;
        }
        
        long result = 0;
        
        while(x > 0){
            result = (result * 10) + x % 10;
            x /= 10;
        }
        
        if(result > Integer.MAX_VALUE){
            return 0;
        }
        
        if(negative){
            return (int) result * -1;
        }
        
        return (int) result;
        
    }
}
