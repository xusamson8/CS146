
class lab1:
    def twoSum(self, nums , target ):
        numMap = {}
        n = len(nums)

        for i in range(n):
            numMap[nums[i]] = i

        for i in range(n):
            complement = target - nums[i]
            if complement in numMap and numMap[complement] != i :
                return [i, numMap[complement]]
            
        return []
    
#test cases below
nums1 = [2, 7, 11, 15]
target1 = 9
print(lab1().twoSum(nums1, target1))

nums2 = [3, 5, 8, 12]
target2 = 7
print(lab1().twoSum(nums2, target2))

nums5 = [1000000, 2000000, 3000000, 4000000]
target5 = 5000000
print(lab1().twoSum(nums5, target5))
