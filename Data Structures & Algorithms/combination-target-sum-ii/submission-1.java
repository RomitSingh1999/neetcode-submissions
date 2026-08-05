class Solution {
    void helper(List<List<Integer>> res, List<Integer>combination, Integer currSum,int i,int[] nums,int target){
        // System.out.println("current combination: "+combination+" "+currSum);
        if(currSum>=target){
            if(currSum==target){
                List<Integer> tempCombination=new ArrayList<>(combination);
                // System.out.println("within if combination: "+combination+" "+currSum);
//                Collections.sort(tempCombination);
                res.add(tempCombination);
            }
            return;
        }

        for(int j=i;j<nums.length;j++){
            if (j > i && nums[j] == nums[j - 1])
                continue;
            combination.add(nums[j]);
            currSum+=nums[j];
            helper(res,combination,currSum,j+1,nums,target);
            combination.remove(combination.size()-1);
            currSum-=nums[j];
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        helper(res,new ArrayList<>(),0,0,nums,target);
        return res;
    }
}
