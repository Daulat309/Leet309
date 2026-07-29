class Solution {
    int[][] dir = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int numIslands(char[][] grid) {
        int cnt = 0;

        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    System.out.println("Entered");
                    grid[i][j] = '0';
                    cnt++;
                    Stack<int[]> st = new Stack<>();
                    st.push(new int[]{i,j});
                    while(!st.isEmpty()){
                        int[] a = st.pop();
                        for(int[] d : dir){
                            int ni = a[0]+d[0];
                            int nj = a[1]+d[1];
                            if(ni>=0&&nj>=0&&ni<grid.length&&nj<grid[0].length&&grid[ni][nj]=='1'){
                                grid[ni][nj] = '0';
                                st.push(new int[]{ni,nj});
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }
}