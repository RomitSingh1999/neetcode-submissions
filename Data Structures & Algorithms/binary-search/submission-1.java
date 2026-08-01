class Solution {
    public int search(int[] nums, int target) {
        int j=nums.length-1,i=0;
        while(i<=j)
        {
            int middle =i+(j-i)/2;
            if(nums[middle]==target)return middle;
            else if(nums[middle]>target){
                j=middle-1;
            }
            else{
                i=middle+1;
            }
        }
        return -1;
    }
}
