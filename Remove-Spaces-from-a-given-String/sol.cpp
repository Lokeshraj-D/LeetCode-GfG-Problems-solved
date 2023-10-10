class Solution {
public:
    string reverseWords(string s) {
        int l =s.size();
        string sAns="";
        string temp="";
        for(int i=0;s[i]!='\0';i++){
            if(s[i]==' '){
                if(temp != ""){
                    if(sAns=="")
                        sAns = temp;
                    else
                        sAns = temp + " " + sAns;
                    temp="";
                }
                continue;
            }
            temp+=s[i];
        }
        if(temp!="")
            sAns = temp + " " + sAns;
        s.erase(remove(s.begin(), s.end(), ' '), s.end());
        if(temp==s)
            return temp;
        return sAns;
    }
};
