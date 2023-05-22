class Solution {
public:
    
    void solve(vector<string> &ans,int open, int close, string s){
        if(open==0 && close==0){
            ans.push_back(s);
            return;
        }
        

        if(open>0){
            solve(ans, open - 1, close, s+"(");
        }
        if(close>open){
            solve(ans, open, close - 1, s+")");
        }
    }

    vector<string> generateParenthesis(int n) {
        vector<string> ans;
        solve(ans,n, n, "");
        return ans;
    }
};
