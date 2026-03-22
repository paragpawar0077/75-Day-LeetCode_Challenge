class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int words;
for(int i = 0; i < sentences.length; i++){
    String s = sentences[i];
    words = s.split(" ").length;
    max = Math.max(max, words);
}
return max;
    }
}