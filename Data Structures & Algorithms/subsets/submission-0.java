class Solution {
    void helper(List<List<Integer>>ans,List<Integer> temp,int i,int[] nums){
        if(i>=nums.length) {
            ans.add(temp);
            return;
        }
        List<Integer> t1=new ArrayList<>(temp);
        t1.add(nums[i]);
        helper(ans, temp,i+1,nums);
        helper(ans, t1,i+1,nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans,new ArrayList<>(),0,nums);
        return ans;
    }
}
