class Solution {
    public boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length()-1;
        
        while(start<=end){
           if( s.charAt(start)!=s.charAt(end)){
            if(isPalindrome(s, start+1, end) || isPalindrome(s,start,end-1)){
                return true;
            }
            return false;
           }
           
           start++;
          end--;
           
        }
        return true;
    }
    static boolean isPalindrome(String s,int start,int end){
                while(start<=end){
           if( s.charAt(start)!=s.charAt(end)){
            return false;

           }
           
           start++;
          end--;
           
        }
        return true;
    }
    
}