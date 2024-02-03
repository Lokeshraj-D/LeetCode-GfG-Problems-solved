class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int ele:nums){
            int i = ele>=0 ? ele : -1*ele; 
            if(nums[i]<0)
                return i;
            nums[i] = nums[i]*-1;
        }
        return 0;
    }
}
