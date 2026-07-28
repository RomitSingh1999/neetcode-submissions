class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<List<Double>> minHeap= new PriorityQueue<>((a, b) -> Double.compare(a.get(0), b.get(0)));
        for(int i=0;i<points.length;i++){
            Double dist=Math.sqrt((points[i][1]*points[i][1]) + (points[i][0]*points[i][0]));
            minHeap.add(List.of(dist,(double)points[i][0],(double)points[i][1]));
        }
        int[][] ans=new int[k][2];
        int i=0;
        while(k>0){
            List<Double> value=minHeap.peek();
            System.out.println(value);
            ans[i][0]=value.get(1).intValue();
            ans[i][1]=value.get(2).intValue();
            minHeap.poll();
            k--;
            i++;
        }
        return ans;
    }
}
