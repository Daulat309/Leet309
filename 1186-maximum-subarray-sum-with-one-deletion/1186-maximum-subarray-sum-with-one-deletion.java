class Solution {
    public int maximumSum(int[] a) {
        int od = 0;
        int nd = a[0];
        int h = 1,mx = a[0];
        while(h<a.length){
            od = Math.max(a[h]+od, nd);
            nd = Math.max(nd+a[h],a[h]);
            mx = Math.max(mx,Math.max(od,nd));
            h++;
        }
        return mx;
    }
}