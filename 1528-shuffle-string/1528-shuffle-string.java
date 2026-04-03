
class Solution {
    public String restoreString(String s, int[] indices) {
            char [] arr = new char[indices.length];
            char [] str = s.toCharArray();
        for(int i=0;i<indices.length;i++){
            arr[indices[i]]=str[i];
        }
        String S =  new String(arr); 
        return S;
    }
}