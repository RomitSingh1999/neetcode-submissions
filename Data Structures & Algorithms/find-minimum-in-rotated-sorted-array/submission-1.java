class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            System.out.println("values: "+i+" "+mid+" "+j);
            if(i==mid){
                return Math.min(nums[mid],nums[j]);
            }
            if(nums[mid]<nums[j] && (nums[mid]<nums[i]||nums[mid]>nums[i]))
            {
                j=mid;
            }
            else if(nums[mid]>nums[j] && nums[mid]>nums[i])
            {
                i=mid;
            }
            
        }
        return nums[i];
    }
}
