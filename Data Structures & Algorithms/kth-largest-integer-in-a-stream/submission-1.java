class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int K=-1;
    public KthLargest(int k, int[] nums) {
        K=k;
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
        }
        while(minHeap.size()>k){
            System.out.println(minHeap.peek());
            minHeap.poll();
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size()>K)
        minHeap.poll();
        // System.out.println("just added"+val+" :"+minHeap.peek());
        return minHeap.peek(); 
    }
}
