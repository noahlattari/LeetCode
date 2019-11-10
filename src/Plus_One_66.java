public class Plus_One_66 {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length -1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] edge = new int[digits.length + 1];
        edge[0] = 1;

        return edge;

    }
}
