class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> st= new ArrayDeque<>();
       List<int[]> cars= new ArrayList<>();
       for(int i=0;i<position.length;i++){
        cars.add(new int[]{target-position[i],speed[i]});
       }
    //    System.out.println(cars);
       cars.sort((a,b)-> b[0]-a[0]);
       for(int i=position.length-1;i>=0;i--){
        
        double newcar= ((double)cars.get(i)[0]/(double)cars.get(i)[1]);
        // System.out.println(cars.get(i)[0]+" "+cars.get(i)[1]+" "+newcar);
        if(!st.isEmpty() && st.peek()>=newcar){
            // System.out.println("--->"+st.peek()+" - "+newcar);
            continue;
        }
        st.push(((Double)newcar));
        // System.out.println("peek--"+st.peek());
       }
        return st.size();
    }
}
