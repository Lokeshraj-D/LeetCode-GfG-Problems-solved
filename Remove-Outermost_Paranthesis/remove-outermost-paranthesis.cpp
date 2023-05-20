class Solution {
public:
    string removeOuterParentheses(string s) {
        stack<char> st;
        string sa="";
        for(int i=0;i<s.length();i++){
            int el=s[i];
            if(st.empty()){
                st.push(el);
                continue;
            }
            if(el=='(' || el== '{' || el=='[')
                st.push(el);
            else{
                st.pop();
            }

            if(!st.empty())
                sa+=s[i];
        }

        return sa;  
    }
};
