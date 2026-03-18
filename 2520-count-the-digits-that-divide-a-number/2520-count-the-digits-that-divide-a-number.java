class Solution {
    public int countDigits(int num) {
        int original = num;
        int z;
        int output=0;
        while(num>0){
            z=num%10;
            if(original%z==0){
                output++;
            }
            num=num/10;
        }
        return output;
    }
}