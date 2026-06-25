class Solution {
    public int minSubArrayLen(int x, int[] a) {
        int l = 0, h = 0, s = 0, mn = Integer.MAX_VALUE;
        s = 0;
        while(h<a.length){
            s += a[h];
            while(s>=x){
                mn = Math.min(mn,h-l+1);
                s-= a[l];
                l++;
            }
            h++;
        }
        return mn==Integer.MAX_VALUE?0:mn;
    }
}