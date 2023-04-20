class Solution{
    public:
    bool wifiRange(int N, string S, int X){
        int c=X;
        bool desp=true;
        for(int i=0;i<N;i++){
            if(c<0)
                return false;
            if(S[i]=='1'){
                c=X;
                desp=false;
                continue;
            }
            if(c==0){
                if(desp)
                    return false;
                else{
                    c=X;
                    desp=true;
                }
            }
            c--;
        }
        if(desp)
            return false;
        return true;
    }
};
