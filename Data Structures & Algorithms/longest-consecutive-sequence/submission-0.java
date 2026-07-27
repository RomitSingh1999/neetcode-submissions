class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!st.contains(nums[i]-1)){
                int key=nums[i];
                map.put(key,new ArrayList<>());
                map.get(key).add(key);
                int nextVal=nums[i]+1;
                while(st.contains(nextVal)){
                    map.get(key).add(nextVal);
                    nextVal+=1;
                }
            }
        }
        int maxVal=0;
        for(Map.Entry <Integer, List<Integer>> element: map.entrySet()){
            maxVal=Math.max(maxVal,element.getValue().size());
        }
        return maxVal;
    }
}
