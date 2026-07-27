class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int arr[] = new int[n];
        Stack<Integer>s= new Stack<>();
        for(int i=0;i<n;i++){
            // System.out.println(arr[i]);
            while(!s.empty() && temperatures[s.peek()]<temperatures[i]){
                int k=s.peek();
                arr[k]=i-k;
                s.pop();
            }
            s.push(i);
        }
        return arr;
    }
}
