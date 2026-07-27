class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        if(n==1)
        return nums;

        int arr1[]=new int[n];
        int arr2[]=new int[n];
        arr1[0]=nums[0];
        arr2[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            arr1[i]=arr1[i-1]*nums[i];
            arr2[n-1-i]=arr2[n-i]*nums[n-i-1];
        }
        
        int ans[]= new int[n];

        for(int i=0;i<n;i++){
            if(i==0){
                ans[i]=arr2[i+1];
                continue;
            }
            if(i==(n-1))
            {
                ans[i]=arr1[n-2];
                continue;
            }
            ans[i]=arr1[i-1]*arr2[i+1];
        }

        return ans;
    }
}  
