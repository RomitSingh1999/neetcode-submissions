class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length, cols=matrix[0].length;
        int ri=0,rj=rows-1;
        
        while(ri<=rj){
            int mid= ri+(rj-ri)/2;
            int i=0,j=cols-1;
            while(i<=j){
                int midc=i+(j-i)/2;
                if(target==matrix[mid][midc]){
                    return true;
                }
                else if (target<matrix[mid][midc]){
                    j=midc-1;
                }
                else{
                    i=midc+1;
                }
            }
            System.out.println("Before values: "+mid+" "+ri+" "+rj);
            if(target>matrix[mid][cols-1]){
                ri=mid+1;
            }
            else if (target<matrix[mid][0]){
                rj=mid-1;
            }
            else{
                return false;
            }
            System.out.println("After values: "+mid+" "+ri+" "+rj);
        }
        return false;
    }
}
