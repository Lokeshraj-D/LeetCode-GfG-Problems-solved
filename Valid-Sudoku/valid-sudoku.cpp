class Solution {
public:
    bool checkBox(vector<vector<char>>& board, int c, int r){
        vector<int> v(9, -1);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int x=i+r;
                int y=j+c;
                if(board[x][y]=='.')
                    continue;

                int num=int(board[x][y])-48;
                num=num%9;
                if(v[num]!=-1)
                    return false;
                
                v[num]=1;
            }
        }
        return true;
    }

    bool checkCol(vector<vector<char>>& board, int c){
        vector<int> v(9, -1);
        for(int i=0;i<9;i++){
            if(board[i][c]=='.')
                continue;
            
            int x=int(board[i][c])-48;
            x=x%9;
            if(v[x]!=-1)
                return false;
            
            v[x]=1;
        }
        return true;
    }

    bool checkRow(vector<vector<char>>& board, int r){
        vector<int> v(9, -1);
        for(int i=0;i<9;i++){
            if(board[r][i]=='.')
                continue;
            
            int x=int(board[r][i])-48;
            x=x%9;
            if(v[x]!=-1)
                return false;
            
            v[x]=1;
        }
        return true;
    }

    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0;i<9;i++)
            if(!checkCol(board, i) || !checkRow(board, i) )
                return false;
            
        
        for(int i=0;i<9;i+=3)
            for(int j=0;j<9;j+=3)
                if(!checkBox(board, i, j))
                    return false;
            
        

        return true;
    }
};
