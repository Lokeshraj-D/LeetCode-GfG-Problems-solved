class Solution {
    public int binarySearch(int[] nums,int l, int h, int target){
        if(l<0 || h>=nums.length || l>h)
            return -1;
        int m = (l+h)/2;
        if(nums[m]==target)
            return m;
        if(l==h)
            return -1;

        if(nums[m]>target){
            return binarySearch(nums, l, m-1, target);
        }
        else
            return binarySearch(nums, m+1, h, target);
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums,0, nums.length-1, target);
    }
}
