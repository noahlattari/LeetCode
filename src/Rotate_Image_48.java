public class Rotate_Image_48 {
    public void rotate(int[][] matrix) {

        //swap rows
        int start = 0;
        int end = matrix.length -1;

        while(start < end){
            int[] temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start++; end--;
        }
        //transpose
        for(int r = 0; r < matrix.length; r++) {
            for (int c = r + 1; c < matrix[r].length; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
    }
}
