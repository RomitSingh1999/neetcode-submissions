class Solution {
    void helper(Set<List<Integer>> res, List<Integer>combination, Integer currSum,int[] nums,int target){
        // System.out.println("current combination: "+combination+" "+currSum);
        if(currSum>=target){
            if(currSum==target){
                List<Integer> tempCombination=new ArrayList<>(combination);
                // System.out.println("within if combination: "+combination+" "+currSum);
                Collections.sort(tempCombination);
                res.add(tempCombination);
            }
            return;
        }

        for(int j=0;j<nums.length;j++){
            if(currSum>target)continue;
            combination.add(nums[j]);
            currSum+=nums[j];
            helper(res,combination,currSum,nums,target);
            combination.remove(combination.size()-1);
            currSum-=nums[j];
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Set<List<Integer>> res= new HashSet<>();
        helper(res,new ArrayList<>(),0,nums,target);

        Iterator<List<Integer>> iterator= res.iterator();
        List<List<Integer>> ans=new ArrayList<>();
        while(iterator.hasNext()){
            ans.add(iterator.next());
        }
        return ans;
    }
}
