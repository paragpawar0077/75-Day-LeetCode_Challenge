class Solution {
    public int numberOfSpecialChars(String word) {
        boolean [] lower = new boolean[26];
        boolean [] upper = new boolean[26];

        for(char s : word.toCharArray()){
            if (Character.isLowerCase(s)){
                lower[s-'a']=true;
            }
            if(Character.isUpperCase(s)){
                upper[s-'A']=true;
            }
        }
        int count=0;
        for(int i =0;i<26;i++){
            if(lower[i]==true && upper[i]==true){
                count++;
            }
        }
        return count;
    }
}