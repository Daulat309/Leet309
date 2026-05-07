class Solution {
    public int maxSubArray(int[] a) {
        int h = 1, s = a[0], cur = a[0];
        while(h<a.length){
            cur = Math.max(a[h],cur+a[h]);
            s = Math.max(s,cur);
            h++;
        }
        return s;
    }
}