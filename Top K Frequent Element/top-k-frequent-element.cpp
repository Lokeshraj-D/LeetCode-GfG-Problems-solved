class Solution {
public:

    void insertVector(vector<int> &v,unordered_map<int,int> uno, int x){
        if(v.empty())
            v.push_back(x);
        else{
            int l=v.size();
            for(int i=0;i<l;i++){
                if(uno[x] >= uno[v[i]]){
                    v.insert(v.begin()+i, x);
                    break;
                }
                if(i==l-1)
                    v.push_back(x);
            }
        }
    }

    vector<int> topKFrequent(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        unordered_map<int,int> uno;
        vector<int> v;
        int x=nums[0];
        int c=0;
        for(int n:nums){
            if(x!=n){
                uno[x]=c;
                insertVector(v,uno,x);
                x=n;
                c=1;
            }
            else
                c++;
        }
        uno[x]=c;
        insertVector(v,uno,x);

        vector<int> ans;
        for(int i=0;i<k;i++)
            ans.push_back(v[i]);
        
        return ans;
    }
};
