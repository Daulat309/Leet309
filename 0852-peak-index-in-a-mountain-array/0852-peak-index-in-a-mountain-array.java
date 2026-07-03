class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int l = 0, h = a.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]>a[m+1]) h = m - 1;
            else l = m + 1;
        }
        return l;
    }
}