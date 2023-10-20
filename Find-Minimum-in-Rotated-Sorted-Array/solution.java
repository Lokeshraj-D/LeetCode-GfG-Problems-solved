class Solution {
    public int binarySearch(int[] nums, int l, int h, int mid, boolean flag){
        if(l>h)
            return 0;
        if(l==h){
            if(flag)
                return Math.min(nums[l-1],nums[l]);
            return Math.min(nums[l+1], nums[l]);
        }

        int el = nums[l];
        int m = (l+h)/2;
        if(flag && el<mid)
            return el;
        
        if(!flag && nums[h]>mid)
            return mid;

        if(nums[m]>el){
            return binarySearch(nums, m+1, h, nums[m], true);
        }
        else if(nums[m]<el){
            return binarySearch(nums, l, m-1, nums[m], false);
        }
        else{
            return Math.min(nums[l], nums[h]);
        }
    }

    public int findMin(int[] nums) {
        if(nums[0]<=nums[nums.length-1])
            return nums[0];
        return binarySearch(nums, 0, nums.length-1, -5001, true);
    }
}
