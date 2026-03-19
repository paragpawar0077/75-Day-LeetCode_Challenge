class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();
        
        int z;
        for(int i=left;i<=right;i++){
            boolean flag=false;
            int original=i;
            int temp =i;
            while(temp>0){
                z=temp%10;
                
                if( z==0 || original%z !=0 ){
                    flag=true;
                    break;
                }
                temp=temp/10;
            }
            if(flag==false){
                answer.add(i);
            }


        }
        return answer;
    }
}