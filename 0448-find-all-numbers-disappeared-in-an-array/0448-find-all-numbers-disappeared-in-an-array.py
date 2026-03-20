from typing import List

class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        
        i = 0
        while i < len(nums):
            correct = nums[i] - 1
            
            if nums[i] != nums[correct]:
                self.swap(nums, i, correct)
            else:
                i += 1
        
        ans = []
        
        for j in range(len(nums)):
            if nums[j] != j + 1:
                ans.append(j + 1)
        
        return ans
    
    def swap(self, arr, first, second):
        temp = arr[first]
        arr[first] = arr[second]
        arr[second] = temp