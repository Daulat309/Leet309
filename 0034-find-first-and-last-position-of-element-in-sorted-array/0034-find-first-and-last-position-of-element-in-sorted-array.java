class Solution {
    public int[] searchRange(int[] ar, int x) {
        if(ar.length==0) return new int[] {-1,-1};
        int[] arr = new int[2];
        int lbb = lb(ar,x);
        arr[0] = ar[lbb]==x?lbb:-1;
        arr[1] = ar[lbb]==x?ub(ar,x)-1:-1;
        return arr;
    }

    public static int lb(int[] ar, int x){
        int l = 0;
        int h = ar.length-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(ar[mid]>=x) h = mid-1;
            else l = mid + 1;
        }
        return l;
    }

    public static int ub(int[] ar, int x){
        int l = 0;
        int h = ar.length-1;
        int ub = ar.length;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(ar[mid]>x){
                ub = mid;
                h = mid-1;
            }
            else l = mid + 1;
        }
        return ub;
    }
}