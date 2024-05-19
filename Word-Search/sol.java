class Solution {

    public boolean backtrack(char[][] board, boolean[][] visited, int col, int row, String word, int ind){
        if(ind==word.length())
            return true;

        if(col<board.length-1 && !visited[col+1][row] && board[col+1][row]==word.charAt(ind)){
            visited[col+1][row] = true;
            if(backtrack(board, visited, col+1, row, word, ind+1)) return true;
            visited[col+1][row] = false;
        }

        if(col>0 && !visited[col-1][row] && board[col-1][row]==word.charAt(ind)){
            visited[col-1][row] = true;
            if(backtrack(board, visited, col-1, row, word, ind+1)) return true;
            visited[col-1][row] = false;
        }

        if(row<board[0].length-1 && !visited[col][row+1] && board[col][row+1]==word.charAt(ind)){
            visited[col][row+1] = true;
            if(backtrack(board, visited, col, row+1, word, ind+1)) return true;
            visited[col][row+1] = false;
        }

        if(row>0 && !visited[col][row-1] && board[col][row-1]==word.charAt(ind)){
            visited[col][row-1] = true;
            if(backtrack(board, visited, col, row-1, word, ind+1)) return true;
            visited[col][row-1] = false;
        }

        return false;

    }

    public boolean exist(char[][] board, String word) {
        List<List<Integer>> ind = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0; j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    ind.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }

        boolean[][] visited = new boolean[board.length][board[0].length];

        for(int i=0;i<ind.size();i++){
            List<Integer> temp = ind.get(i);
            visited[temp.get(0)][temp.get(1)] = true;
            if(backtrack(board, visited, temp.get(0), temp.get(1), word, 1)){
                System.out.print(temp.get(0) + "\n" + temp.get(1));
                return true;
            }
            visited[temp.get(0)][temp.get(1)] = false;
        }
        return false;
    }
}
