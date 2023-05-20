class Solution {
public:
    
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length())
            return false;
        int l=s.length();
        vector<char> vs,vt;

        for(int i=0;i<l;i++){
            vs.push_back(s[i]);
            vt.push_back(t[i]);
        }
        sort(vs.begin(), vs.end());
        sort(vt.begin(), vt.end());

        for(int i=0;i<l;i++)
            if(vs[i]!=vt[i])
                return false;

        return true;
    }
};
