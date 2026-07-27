class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for(int num:nums){
            if(map.containsKey(target-num) && target-num==num){
                if(map.get(num).size()>1)
                return new int[] {map.get(num).get(0),map.get(num).get(1)};
            }
            else if(map.containsKey(target-num)){
                return new int[]{map.get(num).get(0),map.get(target-num).get(0)};
            }
        }
        return new int[0];
    }
}
