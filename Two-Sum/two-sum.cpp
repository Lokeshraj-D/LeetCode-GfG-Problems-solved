class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        //sort(nums.begin(), nums.end());
        int l=nums.size();
        vector<int> ans(2);
        int i=0;
        while(i<l-1){
            int x=nums[i];
            for(int j=i+1;j<l;j++){
                int y=nums[j];
                if(x+y == target){
                    ans[0]=i; ans[1]=j;
                    return ans;
                }
            }
            i++;
        }
        return ans;
    }
};
