class Solution {
    public int maxDistance(int[] a, int[] b) {
        int i, j;
        for(i = 0,j=0;i<a.length&&j<b.length;j++){
            if(a[i]>b[j]) i++;
        }
        return Math.max(0,j-i-1);
    }
}