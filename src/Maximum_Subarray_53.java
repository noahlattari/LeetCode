public class Maximum_Subarray_53 {
    public int maxSubArray(int[] A) {
        int[] memo = new int[A.length];
        memo[0] = A[0];
        int maxSum = memo[0];

        for(int i = 1; i < A.length; i++){
            memo[i] = Math.max(A[i], memo[i-1] + A[i]);
            maxSum = Math.max(memo[i], maxSum);
        }
        return maxSum;
    }
}
