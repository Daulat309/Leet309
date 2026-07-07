class Solution {
    public int pivotIndex(int[] a) {
        int r = 0;
        for(int i : a) r += i;
        int l = 0;
        for(int i = 0;i<a.length;i++){
            r -= a[i];
            if(l==r) return i;
            l += a[i];
        }
        return -1;
    } 
}