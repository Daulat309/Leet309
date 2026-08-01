class Solution {
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public void solve(char[][] board) {
        for(int i = 0;i<board[0].length;i++){
            if(board[0][i]=='O'){
                board[0][i]='#';
                dfs(board,0,i);
            }
            if(board[board.length-1][i]=='O'){
                board[board.length-1][i]='#';
                dfs(board,board.length-1,i);
            }
        }
        for(int i = 0;i<board.length;i++){
            if(board[i][0]=='O'){
                board[i][0]='#';
                dfs(board,i,0);
            }
            if(board[i][board[0].length-1]=='O'){
                board[i][board[0].length-1]='#';
                dfs(board,i,board[0].length-1);
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=='O') board[i][j] = 'X';
                if(board[i][j]=='#') board[i][j] = 'O'; 
            }
        }
    }

    public void dfs(char[][] board, int i, int j){
        for(int[] d : dir){
            int ni = i + d[0];
            int nj = j + d[1];
            if(ni>=0&&nj>=0&&ni<board.length&&nj<board[0].length&&board[ni][nj]=='O'){
                board[ni][nj]='#';
                dfs(board,ni,nj);
            }
        }
    }
}