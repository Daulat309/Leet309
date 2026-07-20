class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k = k % (grid.length*grid[0].length);
        int s = 0, e = grid.length*grid[0].length-1;
        if(k>0){
            flip(grid,s,e);
            flip(grid,s,k-1);
            flip(grid,k,e);
        }
        //done! next part requied format for return
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<grid.length;i++){
            List<Integer> ls = new ArrayList<>();
            for(int j = 0;j<grid[0].length;j++){
                ls.add(grid[i][j]);
            }
            list.add(ls);
        }
        return list;
    }

    public void flip(int[][] a, int s, int e){
        while(s<e){
            int tmp = a[s / a[0].length][s % a[0].length];
            a[s / a[0].length][s % a[0].length] = a[e / a[0].length][e % a[0].length];
            a[e / a[0].length][e % a[0].length] = tmp;
            s++;
            e--;
        }
    }
}