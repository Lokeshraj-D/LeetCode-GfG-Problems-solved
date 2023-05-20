class Solution {
public:
    int longestPalindrome(string s) {
        vector<int> v(52, 0);
        int c=0;
        for(auto ele: s){
            int ind=0;
            if(isupper(ele))
                ind=26;
            ind+=tolower(ele)-'a';
            v[ind]++;
            if(v[ind]==2){
                v[ind]-=2;
                c+=2;
            }
            cout << c << endl;
        }
        for(int i=0;i<52;i++)
            if(v[i]==1)
                return c+1;
        return c;
    }
};
