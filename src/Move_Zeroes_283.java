public class Move_Zeroes_283 {
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
    public void moveZeroes(int[] nums) {
        int fast = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[fast++] = nums[i];
            }
        }

        for(int i = fast; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
