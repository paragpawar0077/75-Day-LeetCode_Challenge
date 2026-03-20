class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        answer=[]
        self.cyclicsort(nums)

        duplicate = -1
        missing = -1

        for i in range(len(nums)):
            if nums[i] != i + 1:
                duplicate = nums[i]
                missing = i + 1

                return [duplicate, missing]
    

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
           