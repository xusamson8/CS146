class hw6:
    from typing import List
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        nums.sort()

        for i, a in enumerate(nums): # i is the index and a is the item
            if i > 0 and a == nums[i-1]: # if theyre the same #
                continue #then continue to next iteration of the loop

            l, r = i+1 , len(nums)-1 # i is i+1, r is length -1 
            while l < r:
                sum = a + nums[l] + nums[r]
                if sum > 0:
                    r-=1 #decrements the pointer to a smaller number since array alr sorted
                elif sum < 0:
                    l+=1
                else:
                    ans.append([a,nums[l],nums[r]]) #put it in the answer array
                #updating pointers , without duplicates
                    l+=1 #only shifting left pointer
                    while nums[l] == nums[l-1] and l < r:
                        l+=1
            return ans

#announced test cases 1 and 2
nums1 = [0,1,1]
nums2 = [-5,0,5,10,-10,0] 
nums3 = [0,0,0]
nums4 = [-1,0,1,2,-1,-4]

print(hw6().threeSum(nums1))
print(hw6().threeSum(nums2))
print(hw6().threeSum(nums3))
print(hw6().threeSum(nums4))