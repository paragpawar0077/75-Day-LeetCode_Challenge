class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        answer =[]
        for i in range(left,right+1):
            flag= False
            temp =i
            original =i
            while(temp>0):
                z=temp%10
                if(z==0 or original%z !=0):
                    flag = True
                    break
                temp=temp//10
            if(flag==False):
                answer.append(i)
        return answer