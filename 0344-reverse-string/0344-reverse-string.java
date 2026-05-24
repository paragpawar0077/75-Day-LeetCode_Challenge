class Solution {
    public void reverseString(char[] s) {
        int start =0;
        int end = s.length-1;
        
            swap(s,start,end);
        
        
    }
    public void swap(char [] s,int  start, int end){
        if(start<=end){
        char temp = s[start] ;
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;
        swap( s, start,end);
        }
    }
}