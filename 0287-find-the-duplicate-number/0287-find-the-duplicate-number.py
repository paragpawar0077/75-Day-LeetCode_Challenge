class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        self.cyclicsort(nums)

        for i in range (len(nums)):
            if(nums[i] != i + 1):
                return nums[i]
            
        

        return -1
    

    def cyclicsort(self, nums: List[int]):
        i = 0
        while(i < len(nums)):
            correct = nums[i] - 1

            if(nums[i] != nums[correct]):
                self.swap(nums, i, correct)
            else :
                i+=1
            
        
    

    def swap(self, nums: List[int],  i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    
