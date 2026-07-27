class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            minHeap.add(stones[i]);
        }
        while(minHeap.size()>1){
            int x=minHeap.peek();
            minHeap.poll();
            int y=minHeap.peek();
            minHeap.poll();
            if(x>y)
            {
                minHeap.add(x-y);
            }
            else if(y>x){
                minHeap.add(y-x);
            }
        }
        if(minHeap.size()==0) return 0;
        return minHeap.peek();
    }
}
