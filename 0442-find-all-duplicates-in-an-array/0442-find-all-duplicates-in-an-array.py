class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        answer=[]
        self.cyclicsort(nums)

        for i in range (len(nums)):
            if(nums[i] != i + 1):
                answer.append(nums[i])
            
        

        return answer
    

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
    