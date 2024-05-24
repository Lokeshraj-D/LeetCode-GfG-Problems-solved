class Solution {
    

    public boolean isSafe(int n, int[][] board, int col, int row){
        for(int i=0;i<col;i++){
            if(board[i][row]==1)
                return false;
        }
        for(int i=col-1,j=row-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]==1)
                return false;
        }
        for(int i=col-1,j=row+1; i>=0 && j<n; i--,j++){
            if(board[i][j]==1)
                return false;
        }
        return true;
    }

    public List<String> construct(int[][] board){
        List<String> arr = new ArrayList<>();
        int n = board.length;
        for(int i=0;i<n;i++){
            String s = new String();
            for(int j=0;j<n;j++){
                if(board[i][j]==1)
                    s+="Q";
                else
                    s+=".";
            }
            arr.add(s);
        }
        return arr;
    }

    public void checkQueen(int n, int col, int board[][],List<List<String>> sol){
        if(col==n){
            sol.add(construct(board));
            return;
        }

        for(int i=0; i<n; i++){
            if(isSafe(n, board, col, i)){
                board[col][i]=1;
                checkQueen(n, col+1, board, sol);
                board[col][i]=0;
            }
        }
    }


    public List<List<String>> solveNQueens(int n) {
        List<List<String>> sol = new ArrayList<>();
        int[][] board = new int[n][n];
        for(int i=0;i<n;i++){
            board[0][i]=1;
            checkQueen(n, 1, board, sol);
            board[0][i]=0;
        }
        return sol;
    }
}
