

class Solution {
public:
    string sortString(string s) {
        string sa="";
        vector<int> v(26, 0);
        for(auto el: s)
            v[el-'a']++;
        
        while(s.size()!=sa.size()){
            for(int i=0;i<26;i++){
                if(v[i]!=0){
                    sa+=char('a'+i);
                    --v[i];
                }
            }
            for(int i=25;i>=0;i--){
                if(v[i]!=0){
                    sa+=char('a'+i);
                    --v[i];
                }
            }
        }
        cout << sa;
        return sa;
    }
};
