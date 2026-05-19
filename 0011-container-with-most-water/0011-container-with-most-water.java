class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length-1;
        int maxx=0;
        while(left<right){
            int width = (right-left);
            int height = Math.min(heights[left],heights[right]);
            int water = height*width;
            if(heights[left]<heights[right]){
                left++;
            }
            else right--;
            int z = Math.max(maxx,water);
            if(z>maxx){
                maxx = water;
            }
        }
        return maxx;
    }
}
