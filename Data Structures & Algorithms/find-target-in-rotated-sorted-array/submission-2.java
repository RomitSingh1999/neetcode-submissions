class Solution {
    public int binarySearch(int[] nums,int l,int r,int target){

        while(l<=r){

            int mid=l+(r-l)/2;

            if(nums[mid]==target)
                return mid;

            if(nums[mid]<target)
                l=mid+1;
            else
                r=mid-1;
        }

        return -1;
    }

    public int search(int[] nums,int target){

        int left=0;
        int right=nums.length-1;

        while(left<right){

            int mid=left+(right-left)/2;

            if(nums[mid]>nums[right])
                left=mid+1;
            else
                right=mid;
        }

        int pivot=left;

        int ans=binarySearch(nums,0,pivot-1,target);

        if(ans!=-1)
            return ans;

        return binarySearch(nums,pivot,nums.length-1,target);
    }
}
 