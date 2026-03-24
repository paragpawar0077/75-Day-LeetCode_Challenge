class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // position for next non-zero

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}