class Solution {
    public double myPow(double x, int n) {
        long N=n;

        if(n<0){
            x=1/x;
            N=-N;
        }
        return solve(x,N);
    }
    public double solve(double x,long n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return solve(x*x,n/2);
        }
        else{
            return x*solve(x*x,n/2);
        }
    }
}