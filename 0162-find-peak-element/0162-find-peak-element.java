class Solution {
    public int findPeakElement(int[] n) {
        int l = 0, h = n.length-1;
        while(l<=h){
            int m = l +(h-l)/2;
            if(m<h&&n[m]<n[m+1]) l = m + 1;
            else if (0<m&&n[m]<n[m-1]) h = m-1;
            else return m;
        }
        return l;
    }
}