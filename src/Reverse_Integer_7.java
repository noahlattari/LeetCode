public class Reverse_Integer_7 {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0){
            isNegative = true;
            x *= -1;
        }

        long result = 0;
        while(x > 0){
            result = (result * 10) + x % 10;
            x /= 10;
        }
        if(result > Integer.MAX_VALUE){
            return 0;
        }
        if(isNegative){
            result *= -1;
        }
        return (int) result;
    }
}
