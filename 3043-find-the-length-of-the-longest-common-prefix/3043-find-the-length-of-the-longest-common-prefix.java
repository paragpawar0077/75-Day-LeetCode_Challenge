class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for(int nums : arr1){
            String digit = String.valueOf(nums);

            for(int i=1;i<=digit.length();i++){
                set.add(Integer.parseInt(digit.substring(0,i)));
            }
        }

        for(int nums : arr2){
            String digi = String.valueOf(nums);

            for(int j=1;j<=digi.length();j++){

                int prefix =
                        Integer.parseInt(digi.substring(0,j));

                if(set.contains(prefix)){
                    max = Math.max(max,j);
                }
            }
        }

        return max;
    }
}