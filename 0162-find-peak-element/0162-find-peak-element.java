class Solution {
    public int findPeakElement(int[] a) {
        if(a.length==1||a[0]>a[1]) return 0;
        if(a[a.length-1]>a[a.length-2]) return a.length-1;

        int l = 1, h = a.length-2;
        while(l<h){
            int m = l + (h-l) / 2;
            if(a[m-1]<a[m]&&a[m]>a[m+1]) return m;
            if(a[m]>a[m+1]) h = m - 1;
            else l = m + 1;
        }
        return l;
    }
}