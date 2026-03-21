import re
class Solution:
    def isPalindrome(self, s: str) -> bool:
       s = s.lower()
       s = re.sub(r'[^a-zA-Z0-9]', '', s)
       for i in range (int(len(s)/2)):


        start = s[i]
        end = s[(len(s)-1-i)]
        if(start!=end):
            return False
            
        
       return True
