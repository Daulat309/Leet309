class Solution {
    public int[] sortedSquares(int[] a) {
        int l = 0, h = a.length-1;
        for(int i = a.length-1;i>=0;i--){
            if(Math.abs(a[l])>Math.abs(a[h])){
                int t = a[h];
                a[i] = a[l]*a[l];
                a[l] = t;
            }
            else a[i] = a[h]*a[h];
            h--;
        }
        return a;
    }
}