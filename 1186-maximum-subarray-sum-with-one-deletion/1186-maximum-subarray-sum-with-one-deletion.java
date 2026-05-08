class Solution {
    public int maximumSum(int[] a) {
        int od = 0;
        int nd = a[0];
        int h = 1,mx = a[0];
        while(h<a.length){
            if(od+a[h]<nd){
                od = nd;
            }
            else od += a[h];
            nd = Math.max(nd+a[h],a[h]);
            mx = Math.max(mx,Math.max(od,nd));
            h++;
        }
        return mx;
    }
}