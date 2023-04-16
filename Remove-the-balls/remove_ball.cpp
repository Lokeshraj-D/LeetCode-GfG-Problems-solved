class Solution {
  public:
  
    void print(int arr[], int N){
        for(int i=0;i<N;i++){
            cout << arr[i] << " ";
        }
        cout << endl;
    }
  
    int finLength(int N, vector<int> color, vector<int> radius) {
        
        int nxt[N];
        int prev[N];
        for(int i=0;i<N;i++){
            nxt[i]=i+1;
            prev[i]=i-1;
        }
        prev[0]=0;
        int i=0;
        int c=N;
        while(nxt[i]!=N && nxt[i]!=N+1){
            int nxt_ind=nxt[i];
            int prev_ind=prev[i];
            if(color[i]==color[nxt_ind] &&
               radius[i]==radius[nxt_ind]){
                c-=2;
                nxt[prev_ind]=nxt_ind +1;
                prev[nxt_ind +1]=prev_ind;
                i=prev_ind;
                continue;
            }
            i=nxt[i];
        }
        return c;
    }
};
