class Solution {
    void helper(List<List<Integer>> ans,List<Integer> temp,int[] vis,int[] nums){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i]!=0)continue;
            temp.add(nums[i]);
            vis[i]=1;
            helper(ans,temp,vis,nums);
            temp.remove(temp.size()-1);
            vis[i]=0;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] vis=new int[nums.length];
        helper(ans,new ArrayList<>(),vis,nums);
        return ans;
    }
}
