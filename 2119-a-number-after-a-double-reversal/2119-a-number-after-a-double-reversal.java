class Solution {
    public boolean isSameAfterReversals(int num) {
        int x=reverse(num);
        int y = reverse(x);
        return (y==num);
    }
    public int reverse(int num){
        int z;
        int y=num;
        int reverse=0;
        while(num>0){
            z=num%10;
            reverse=reverse*10+z;
            num=num/10;
        }
        return reverse;
    }
}