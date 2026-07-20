class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k = k % (grid.length*grid[0].length);
        int[] temp = new int[grid.length*grid[0].length];
        // int mul = grid[0].length;
        // for(int i = 0;i<grid.length;i++){
        //     for(int j = 0;j<grid[0].length;j++){
        //         temp[(i*mul)+j] = grid[i][j];
        //     }
        // }
        int s = 0, e = grid.length*grid[0].length-1;
        if(k>0){
        flip(grid,s,e);
        flip(grid,s,k-1);
        flip(grid,k,e);
        }
        // if(k>0){
        // flip(temp,0,temp.length-1);
        // flip(temp,0,k-1);
        // flip(temp,k,temp.length-1);
        // }
        List<List<Integer>> list = new ArrayList<>();
        // for(int i = 0;i<grid.length;i++){
        //     List<Integer> ls = new ArrayList<>();
        //     for(int j = 0;j<grid[0].length;j++){
        //         ls.add(grid[i][j]);
        //     }
        //     list.add(ls);
        // }
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
            int fr = s / a[0].length;
            int fc = s % a[0].length;
            int sr = e / a[0].length;
            int sc = e % a[0].length;
            int tmp = a[fr][fc];
            a[fr][fc] = a[sr][sc];
            a[sr][sc] = tmp;
            s++;
            e--;
        }
    }
    // public void flip(int[] a, int s, int e){
    //     while(s<e){
    //         int temp = a[s];
    //         a[s] = a[e];
    //         a[e] = temp;
    //         s++;
    //         e--;
    //     }
    // }
}