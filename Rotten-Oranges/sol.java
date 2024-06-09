class Solution {

    public void helper(int[][] grd, int i, int j, int n, int m, boolean[][] visited){

        visited[i][j] = true;
        if(i>0 && grd[i-1][j]!=0 && grd[i-1][j]>grd[i][j]+1 && !visited[i-1][j]){
            grd[i-1][j] = grd[i][j]+1;
            helper(grd, i-1, j, n, m, visited);
        }

        if(j>0 && grd[i][j-1]!=0 && grd[i][j-1]>grd[i][j]+1 && !visited[i][j-1]){
            grd[i][j-1] = grd[i][j]+1;
            helper(grd, i, j-1, n, m, visited);
        }

        if(i<n-1 && grd[i+1][j]!=0 && grd[i+1][j]>grd[i][j]+1 && !visited[i+1][j]){
            grd[i+1][j] = grd[i][j]+1;
            helper(grd, i+1, j, n, m, visited);
        }

        if(j<m-1 && grd[i][j+1]!=0 && grd[i][j+1]>grd[i][j]+1 && !visited[i][j+1]){
            grd[i][j+1] = grd[i][j]+1;
            helper(grd, i, j+1, n, m, visited);
        }
        visited[i][j]= false;
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1) grid[i][j] = 101;
                visited[i][j] = false;
            }
        }
        
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                if(grid[i][j]==2) 
                    helper(grid, i, j, n, m, visited);

        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==101){
                    return -1;
                }
                max = max>grid[i][j] ? max : grid[i][j];
            }
        }
        
        return max==0 ? 0 : max-2;
    }
}
