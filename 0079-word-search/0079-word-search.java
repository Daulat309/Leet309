class Solution {
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)&&find(board,i,j,0,word)) return true;
            }
        }

        return false;
        
    }
    public boolean find(char[][] b, int i, int j, int idx, String word){
            if(idx==word.length()) return true;
            if(i<0||j<0||i>=b.length||j>=b[0].length) return false;
            if(b[i][j]=='$'||b[i][j]!=word.charAt(idx)) return false;
            char temp = b[i][j];
            b[i][j] = '$';
            for(int[] d : dir){
                int ni = i+d[0];
                int nj = j+d[1];
                if(find(b,ni,nj,idx+1,word)) return true;
            }
            b[i][j] = temp;
            return false;
    }
}