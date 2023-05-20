class Solution {
public:
    char conjugate(char c){
        if(c==')')
            return '(';
        if(c==']') 
            return '[';
        if(c=='}')
            return '{';
        
        return '0';
    }

    bool isValid(string s) {
        stack<char> st;
        for(int i=0;i<s.length();i++){
            int el=s[i];
            if(el=='(' || el== '{' || el=='[')
                st.push(el);
            else{
                if(st.empty())
                    return false;
                if(conjugate(el)==st.top())
                    st.pop();
                else
                    return false;
            } 
        }
        if(st.empty())
            return true;
        return false;
    }
};
