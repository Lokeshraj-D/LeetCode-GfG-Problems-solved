class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>0)
                break;
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int target = -1*nums[i];
            int l = i+1;
            int h = nums.length - 1;
            while(l<h){
                int sum = nums[l] + nums[h];
                if(sum<target)
                    l++;
                else if(sum>target)
                    h--;
                else{
                    ans.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    int low=nums[l], high = nums[h];
                    while(l<h && nums[l]==low)
                        l++;
                    while(l<h && nums[h]==high)
                        h--;
                }
            }

        }
        return ans;
    }
}
