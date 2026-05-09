class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        
        int longest=0;
        int length;
        int current;
        for(int num:set){
            if(!set.contains(num-1)){
               length=1;
               current=num;
            
            while(set.contains(current+1)){
                current++;
                length++;
            }
            longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}