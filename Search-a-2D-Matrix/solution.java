class Solution {
    public boolean binarySearch(int[][] matrix, int c, int l, int h, int target){
        if(l<0 || h>=matrix[0].length || l>h){
            return false;
        }
        int m = (l+h)/2;
        if(matrix[c][m]==target)
            return true;

        if(l==h)
            return false;

        if(matrix[c][m]>target){
            return binarySearch(matrix, c, l, m-1, target);
        }
        else
            return binarySearch(matrix, c, m+1, h, target);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i=0;
        while(i<m){
            if(matrix[i][0]>=target)
                break;
            i++;
        }
        
        if(i==m){
            return binarySearch(matrix, i-1, 0, n-1, target);
        }
        if(matrix[i][0]==target)
            return true;
        if(i==0)
            return false;
        return binarySearch(matrix, i-1, 0, n-1, target);
    }
}
