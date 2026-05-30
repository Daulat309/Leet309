class Solution {
    public int peakIndexInMountainArray(int[] a) {
        if(a[0]>a[1]) return a[0];
        if(a[a.length-1]>a[a.length-2]) return a[a.length-1];

        int l = 1, h = a.length-2;
        while(l<h){
            int m = l + ( h - l )/2;
            if(a[m]>a[m+1]) h = m;
            else l = m + 1;
        }
        return l;
    }
}