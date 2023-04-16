class Solution {
public:
    
    bool empty(int l[]){
        if(l[0]==0 && l[1]==0 && l[2]==0)
            return true;
        return false;
    }
    
    bool check_occ(queue<int> q, int x){
        if(q.front()==x && q.back()==x)
            return true;
        return false;
    }
    
    bool sol(int a, int b, int c){
        int l[]={a,b,c};
        queue<int> q;
        q.push(-1);
        q.push(-2);
        
        while(!empty(l)){
            int max_val=max(max(l[0],l[1]),l[2]);
            //cout << max_val << endl;
            int max_ind= (l[0]==max_val) ? 0 : (l[1]==max_val ? 1 : 2);
        
            if(check_occ(q,max_ind)){
                max_val=max(l[(max_ind+1) % 3], l[(max_ind+2) % 3]);
                max_ind= l[(max_ind+1) % 3]==max_val ? (max_ind +1)%3 : (max_ind+2)%3;
                if(l[max_ind]==0)
                    return false;
                l[max_ind]--;
                //cout << max_ind;
                q.pop();
                q.push(max_ind);
            }
            
            else{
                if(l[max_ind]==0)
                    return false;
                l[max_ind]--;
                //cout << max_ind;
                q.pop();
                q.push(max_ind);
            }
        }
        return true;
    }
    
    int solve(int a, int b, int c) {
        if(sol(a,b,c))
            return (a+b+c);
        else
            return -1;
    }
};
