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
        //We are looking if the target - the current exists.
        //We iterate through the array, if the target - current element is a key in the hashmap, return the value associated with
        // that key (the index)

        //map.containsKey() checks if a key is present, i.e if we have 22 -> 1 and we do map.containsKey(22) is returns true.
        //map.get() takes in the key and gets the value mapped. i.e map.get(22) returns 1. In our case we pass in the difference to get
        // the index associated with it.

        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int difference = 0;
        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            if(map.containsKey(difference)){
                res[0] = i;
                res[1] = map.get(difference);
                return res;
            }else{
                map.put(nums[i], i);
            }
        }

        return res;
    }

}
