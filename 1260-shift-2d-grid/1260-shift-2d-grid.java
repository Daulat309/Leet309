class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k = k % (grid.length*grid[0].length);
        int[] temp = new int[grid.length*grid[0].length];
        int mul = grid[0].length;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                temp[(i*mul)+j] = grid[i][j];
            }
        }
        // if(k>0){
        // flip(grid,0,grid[0].length-1);
        // flip(grid,0,k-1);
        // flip(grid,k,grid[0].length-1);
        // }
        if(k>0){
        flip(temp,0,temp.length-1);
        flip(temp,0,k-1);
        flip(temp,k,temp.length-1);
        }
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
                ls.add(temp[(i*mul)+j]);
            }
            list.add(ls);
        }
        return list;
    }

    // public void flip(int[][] a, int s, int e){
    //     while(s<e){
    //         for(int i = 0;i<a.length;i++){
    //             int temp = a[0][s];
    //             a[i][s] = a[i][e];
    //             a[i][e] = temp;
    //         }
    //         s++;
    //         e--;
    //     }
    // }
    public void flip(int[] a, int s, int e){
        while(s<e){
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
}