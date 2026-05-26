class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        for(char s: word.toCharArray()){
            set.add(s);
        }
        int count =0;
        for(char ch ='a';ch<='z';ch++){
            if(set.contains(ch) && set.contains((char)(ch^32))){
                count++;
            }
        }
        return count;
    }
}