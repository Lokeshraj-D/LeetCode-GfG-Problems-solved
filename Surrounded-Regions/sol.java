class Solution {

    public void capture(char[][] board, int i, int j, int n, int m, boolean[][] visited){
        
        if(board[i][j]=='O')
            visited[i][j] = false;
        
        if(i>0 && board[i-1][j]=='O' && visited[i-1][j])
            capture(board, i-1, j, n, m, visited);
        
        if(j>0 && board[i][j-1]=='O' && visited[i][j-1])
            capture(board, i, j-1, n, m, visited);

        if(i<n-1 && board[i+1][j]=='O' && visited[i+1][j])
            capture(board, i+1, j, n, m, visited);
        
        if(j<m-1 && board[i][j+1]=='O' && visited[i][j+1])
            capture(board, i, j+1, n, m, visited);
    }

    public void solve(char[][] board) {

        int n = board.length, m = board[0].length;

        boolean[][] visited = new boolean[n][m];

        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                visited[i][j] = true;
        

        for(int i=0; i<n; i++){
            if(board[i][0]=='O' && visited[i][0])
                capture(board, i, 0, n, m, visited);
            if(board[i][m-1]=='O' && visited[i][m-1])
                capture(board, i, m-1, n, m, visited);
        }

        for(int j=0; j<m; j++){
            if(board[0][j]=='O' && visited[0][j])
                capture(board, 0, j, n, m, visited);
            if(board[n-1][j]=='O' && visited[n-1][j])
                capture(board, n-1, j, n, m, visited);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                if(board[i][j]=='O' && visited[i][j])
                    board[i][j]='X';
        }
    }
}
