class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
    }

    public void backtrack(int index,int [] num, List<Integer> current,List<List<Integer>> result){
        if(!result.contains(current)){
        result.add(new ArrayList<>(current));
        }

        for(int i= index ;i<num.length;i++){
            
            current.add(num[i]);
        

            backtrack(i+1,num,current,result);

            current.remove(current.size()-1);
            
        }
    }
}