class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int l=nums.size();
        vector<int> mulLeft(l);
        vector<int> mulRight(l);
        vector<int> sol(l);

        int ml=1, mr=1;
        for(int i=0;i<l;i++){
            ml = ml*nums[i];
            mulLeft[i]=ml;
            mr = mr*nums[l-i-1];
            mulRight[l-i-1]=mr;
        }
        mulLeft.insert(mulLeft.begin(),1);
        mulRight.insert(mulRight.begin(),1);
        mulLeft.push_back(1);
        mulRight.push_back(1);

        for(int i=0;i<l;i++){
            sol[i]=mulLeft[i] * mulRight[i+2];
        }
        return sol;
    }
};
