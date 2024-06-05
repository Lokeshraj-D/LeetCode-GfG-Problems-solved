class Solution {
    
    boolean[][] visited;

    public void checkIslands(char[][] grid, int col, int row, int n, int m, boolean[][] visited){
        visited[col][row] = true;

        if(col-1>=0 && !visited[col-1][row] && grid[col-1][row]=='1')
            checkIslands(grid, col-1, row, n, m, visited);

        if(col+1<n && !visited[col+1][row] && grid[col+1][row]=='1')
            checkIslands(grid, col+1, row, n, m, visited);

        if(row-1>=0 && !visited[col][row-1] && grid[col][row-1]=='1')
            checkIslands(grid, col, row-1, n, m, visited);
        
        if(row+1<m && !visited[col][row+1] && grid[col][row+1]=='1')
            checkIslands(grid, col, row+1, n, m, visited);
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        visited = new boolean[n][m];

        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                visited[i][j]=false;

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    count++;
                    checkIslands(grid, i, j, n, m, visited);
                }
            }
        }
        
        return count;
    }
}
