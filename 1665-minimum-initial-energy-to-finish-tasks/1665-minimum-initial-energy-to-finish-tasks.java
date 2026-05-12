class Solution {
    public int minimumEffort(int[][] t) {
        Arrays.sort(t,(a,b)->(a[1]-a[0])-(b[1]-b[0]));
        int res = 0;
        for(int[] a : t){
            res = Math.max(a[0]+res,a[1]);
        }
        return res;
    }
}