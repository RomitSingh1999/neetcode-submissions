class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.putIfAbsent(nums[i],0);
            mp.put(nums[i],mp.get(nums[i])+1);
        }
        List<Integer>countmp[] =new ArrayList[n];
        for (int i = 0; i < n; i++) {
            countmp[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            System.out.println(""+m.getValue()+"---"+m.getKey());
            countmp[m.getValue()-1].add(m.getKey());
        }
        List<Integer>ans = new ArrayList<>();
        
        for(int i=n-1;i>=0;i--){
            
            if(!countmp[i].isEmpty()){
                for(int j=0;j<countmp[i].size();j++){
                    if(k==0){
                        break;
                    }
                    
                    k--;
                    ans.add(countmp[i].get(j));
                }
            }
        }
        int[] arr = ans.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
