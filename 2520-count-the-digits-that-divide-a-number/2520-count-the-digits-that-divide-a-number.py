class Solution:
    def countDigits(self, num: int) -> int:
        original = num
        output=0
       
        while(num>0):
            z=num%10
            if(original%z==0 and z!=0):
                output+=1
            
            num=num//10
        
        return output
        