class Solution {
    public int search(int[] a, int x) {
        int l  = 0, h = a.length-1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]==x) return m;
            if(a[m]>=a[a.length-1]){
                if(x>a[m]) l = m +1;
                else{
                    if(a[0]>x) l = m + 1;
                    else h = m - 1;
                }
            }
            else{
                if(x<a[m]) h = m-1;
                else{
                    if(x>a[a.length-1]) h = m -1;
                    else l = m + 1;
                }
            }
        }
        return -1;
    }
}