class Solution {
    void helper(List<List<Integer>> ans,List<Integer> temp,int[] nums,int i){
        if(i>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        helper(ans, temp, nums, i + 1);
        temp.remove(temp.size() - 1);
        while(i<nums.length-1 && nums[i]==nums[i+1]){
            i++;
        }
        helper(ans,temp,nums,i+1);

    }
    // {1,2,3}
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        helper(ans,temp,nums,0);
        return ans;
    }
}
