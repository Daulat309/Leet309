class Solution {
    public int findMin(int[] a) {
        int l = 0, h = a.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]<=a[a.length-1]){
                h = m-1;
            }
            else l = m + 1;
        }
        return a[l];
    }
}