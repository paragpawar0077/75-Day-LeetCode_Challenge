class Solution {
    public boolean isPalindrome(int x) {
        int z;
        int y=x;
        int reverse=0;
        while(x>0){
            z=x%10;
            reverse=reverse*10+z;
            x=x/10;
        }
        if(y==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}