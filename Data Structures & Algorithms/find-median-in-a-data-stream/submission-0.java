class MedianFinder {
    List<Double> nums=new ArrayList<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        nums.add((double)num);
    }
    
    public double findMedian() {
        Collections.sort(nums);
        int n=nums.size();
        if(n%2==0){
            return (((nums.get(n/2))/2)+(nums.get((n/2)-1)/2));
        }
        return nums.get(n/2);
    }
}
