import java.util.HashMap;

public class Two_Sum_1 {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum(nums, target);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int current: map.keySet()){
            if(map.containsKey(target - current)){
                res[0] = map.get(target - current);
                res[1] = map.get(current);
            }
        }

        return res;
    }

}
