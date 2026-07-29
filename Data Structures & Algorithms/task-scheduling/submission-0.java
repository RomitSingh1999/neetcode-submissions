class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Map.Entry<Character,Integer>> maxHp = new PriorityQueue <>((a,b)->b.getValue() - a.getValue());
        Map<Character,Integer> mp= new HashMap<>();
        for (char task : tasks) {
            mp.put(task, mp.getOrDefault(task, 0) + 1);
        }
        maxHp.addAll(mp.entrySet());
        int counts=0;
        
        while(!maxHp.isEmpty()){
            int temp=n+1;

            List<Map.Entry<Character,Integer>> lst=new ArrayList<>();
            
            while(temp>0 && !maxHp.isEmpty()){

                lst.add(maxHp.peek());
                maxHp.poll();
                counts++;
                temp--;

            }
            

            for(Map.Entry<Character,Integer>me:lst){
                if(me.getValue()-1>0){
                    me.setValue(me.getValue()-1);
                    maxHp.add(me);
                    if(temp!=0){
                        counts+=temp;
                        temp=0;
                    }
                }
            }

        }
        return counts;
    }
}
