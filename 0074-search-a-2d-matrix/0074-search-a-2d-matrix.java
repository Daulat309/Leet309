class Solution {
    public boolean searchMatrix(int[][] mt, int x) {
        int l = 0, h = mt.length*mt[0].length-1;
        while(l<=h){
            int m = l + (h-l);
            int r = m / mt[0].length;
            int c = m % mt[0].length;
            if(mt[r][c]==x) return true;
            if(mt[r][c]>x) h = m - 1;
            else l = m + 1;
        }
        return false;
    }
}