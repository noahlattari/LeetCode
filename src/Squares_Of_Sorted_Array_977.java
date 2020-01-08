public class Squares_Of_Sorted_Array_977 {
    public int[] sortedSquares(int[] A) {
        int endNeg = -1;
        int[] res = new int[A.length];
        int count = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] < 0 && i + 1 < A.length && A[i+1] >= 0){
                endNeg = i;
            }
            A[i] = A[i] * A[i];
        }

        int begPos = endNeg + 1;

        while(endNeg >= 0 && begPos < A.length){
            if(A[endNeg] < A[begPos]){
                res[count++] = A[endNeg];
                endNeg--;
            }else{
                res[count++] = A[begPos];
                begPos++;
            }
        }
        while(endNeg >= 0){
            res[count++] = A[endNeg];
            endNeg--;
        }
        while(begPos < A.length){
            res[count++] = A[begPos];
            begPos++;
        }
        return res;
    }
}
