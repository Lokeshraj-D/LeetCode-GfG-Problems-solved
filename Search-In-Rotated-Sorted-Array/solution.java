class Solution {

    public int search(int[] nums, int target) {
        
        int l=0, h=nums.length-1;
        int ll = nums.length;
        while(l<h){
            int m = (l+h)/2;
            if(nums[m]>nums[h]) l = m+1;
            else h=m;
        }
        int r = l;
        System.out.println(r);
        int rl=r;
        l=0;
        h=ll-1;

        while(l<=h){
            int m = (l+h)/2;
            int rm = (m+r)%ll;

            if(nums[rm]==target) return rm;
            if(nums[rm]<target) l=m+1;
            else h = m-1;
        }
        return -1;

    }
}
