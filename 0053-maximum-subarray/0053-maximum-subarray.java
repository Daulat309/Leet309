class Solution {
    public int maxSubArray(int[] a) {
        int h = 1, s = a[0];
        while(h<a.length){
            a[h] = Math.max(a[h-1]+a[h], a[h]);
            s = Math.max(s,a[h]);
            h++;
        }
        return s;
    }
}