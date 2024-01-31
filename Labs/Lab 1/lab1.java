import java.util.HashMap;
import java.util.Map;

class lab1{
    public int[] twoSum(int[] nums, int target){
       Map<Integer, Integer> numsMap = new HashMap<>();
       int n = nums.length;

       for(int i = 0; i < n; i++){
            numsMap.put(nums[i], i);
       }

       for(int i = 0 ; i < n; i++){
            int complement = target - nums[i];
            if( numsMap.containsKey(complement) && numsMap.get(complement) != i){
                return new int[] {i, numsMap.get(complement)};
            }
       }

       return new int[]{};
    }
}