package HW.HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hw6 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); //use of arraylist bc its resizable 
        Arrays.sort(nums); 
        for( int i = 0 ; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){ //goes on to netx iteration if duplicates are present
                continue;
            }
            int l = i+1; //used for left pointer
            int r = nums.length -1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r-=1;
                }
                else if (sum < 0) {
                    l+=1;
                }
                else{
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r]))); //creates fixed size arraylist , to add those numbers into the 
                    // array list ans that was created before
                    l+=1;
                    while(nums[l] == nums[l-1] && l<r){
                        l+=1;
                    }
                }
            }
        }
        return ans;
     }

     public static void main(String[] args) {
        hw6 solution = new hw6();
        int [] nums1 = {0,1,1};
        int [] nums2 = {-5,0,5,10,-10,0}; 
        int [] nums3 = {0,0,0};
        int [] nums4 = {-1,0,1,2,-1,-4};
        int [] nums5 = {};

        System.out.println(solution.threeSum(nums1));
        System.out.println(solution.threeSum(nums2));
        System.out.println(solution.threeSum(nums3));
        System.out.println(solution.threeSum(nums4));
        System.out.println(solution.threeSum(nums5));





     }
}
