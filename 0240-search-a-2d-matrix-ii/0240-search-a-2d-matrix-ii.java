class Solution {
    public boolean searchMatrix(int[][] mt, int x) {
        int r = 0, c = mt[0].length-1;
        while(r<mt.length&&c>=0){
            if(mt[r][c]==x) return true;
            if(mt[r][c]>x) c--;
            else r++;
        }
        return false;
    }
}