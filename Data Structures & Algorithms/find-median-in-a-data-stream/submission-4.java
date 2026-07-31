class MedianFinder {
    PriorityQueue<Double> minheap=new PriorityQueue<>();
    PriorityQueue<Double> maxheap=new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxheap.isEmpty())
            maxheap.add(Double.valueOf(num));
        else if(minheap.isEmpty() && num>maxheap.peek())
            minheap.add(Double.valueOf(num));
        else{
            if(num>maxheap.peek()){
                minheap.add(Double.valueOf(num));
            }
            else{
                maxheap.add(Double.valueOf(num));
            }
            if(maxheap.size()>minheap.size()){
                minheap.add(maxheap.peek());
                maxheap.poll();
            }
            else if(maxheap.size()<minheap.size()){
                maxheap.add(minheap.peek());
                minheap.poll();
            }
        }
        
        System.out.println(maxheap+" "+minheap);
        
    }
    
    public double findMedian() {
        System.out.println("Heaps: "+maxheap+" "+minheap);
        if(maxheap.size()==minheap.size()){
            System.out.println("heap values: "+maxheap.peek()+" "+minheap.peek());
            return (maxheap.peek()+minheap.peek())/2;
        }
        return (maxheap.size()>minheap.size()?maxheap.peek():minheap.peek());
    }
}
