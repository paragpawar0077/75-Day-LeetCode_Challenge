class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs){
            char [] ch = word.toCharArray();
            Arrays.sort(ch);
            String Key = new String(ch);

            map.putIfAbsent(Key,new ArrayList<>());

            map.get(Key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}