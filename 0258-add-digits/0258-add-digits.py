class Solution:
    def addDigits(self, num: int) -> int:
        # while(num>=10):
        #     sum=0
        #     while(num>0):
        #         sum+=num%10
        #         num=num//10
        #     num=sum
        # return num
        if(num>0):
            return 1+(num-1)%9
        return 0