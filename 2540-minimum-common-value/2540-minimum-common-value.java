import java.util.HashSet;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            map.add(nums1[i]);
        }
        for(int j =0;j<nums2.length;j++){
            if(map.contains(nums2[j])){
                return nums2[j];
            }
            
        }
        return -1;
    }
}