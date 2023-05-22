class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {
        vector<int> v(26,-1);
        int max=-1;
        for(int i=0;i<s.length();i++){
            int ind= char(s[i]) - 'a';
            if(v[ind]!=-1){
                int dist=i-v[ind]-1;
                max = dist>max ? dist : max;
            }
            else{
                v[ind]=i;
            }
        }

        return max;
    }
};
