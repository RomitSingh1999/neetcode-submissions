class Solution {
    void helper1(List<List<Integer>> ans,int[] nums,int i){
        if(i>=nums.length){
            List<Integer> list = Arrays.stream(nums)
                    .boxed()
                    .collect(Collectors.toList());
            ans.add(list);
            return;
        }
        for(int j=i;j<nums.length;j++){
            int temp=nums[i]+nums[j];
            nums[j]=temp-nums[j];
            nums[i]=temp-nums[j];
            helper1(ans,nums,i+1);
            nums[j]=temp-nums[j];
            nums[i]=temp-nums[j];

        }
    }
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        helper1(ans,nums,0);
        return ans;
    }
}
