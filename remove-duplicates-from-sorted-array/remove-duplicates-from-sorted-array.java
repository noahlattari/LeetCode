class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        //If the element is NOT in the hashmap, add it to the map, then change the array, if it IS do nothing
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
                nums[counter] = nums[i];
                counter++;
            }else{
            }
        }
        return counter;
    */
        //So there is a more efficient two pointer approach to this.
        //Because we are modifying an array in place (pass by value), we must use two pointers.
        //One for the "modified" index and one for the for loop.
        //Since the array is SORTED (key info) if any element has a duplicate, it will be beside it. I.e 1 1 2
        int index = 1; //We start from the second element since there will always be one unique element at least
        for(int i =0; i < nums.length -1; i++){
            if(nums[i] != nums[i+1]){
                nums[index++] = nums[i + 1]; //So if the element beside the current isn't the same, we found unique elements.
                //Use our two pointers to modify the location of the end of the unique elements, I.E if we have  1 2 place it right at 2
            }
        }
​
        return index;
​
    }
}
