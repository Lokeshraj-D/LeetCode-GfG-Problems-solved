class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];

        int dp[] =new int[nums.length+2];
        dp[0] = dp[1] = 0;

        for(int i=2;i<nums.length+2;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i-2]);
        }

        return dp[nums.length+1];
    }
}
