class Solution {
    public int[] searchRange(int[] ar, int x) {
        // if(ar.length==0) return new int[] {-1,-1};
        return new int[]{lb(ar,x),ub(ar,x)};
    }

    public static int lb(int[] ar, int x){
        int l = 0;
        int h = ar.length-1;
        int ans = -1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(ar[mid]>x) h = mid-1;
            else if(ar[mid]<x) l = mid + 1;
            else{
                ans = mid;
                h = mid-1;
            }
        }
        return ans;
    }

    public static int ub(int[] ar, int x){
        int l = 0;
        int h = ar.length-1;
        int ans = -1;

        while(l<=h){
            int mid = l + (h-l)/2;
            if(ar[mid]>x) h = mid-1;
            else if(ar[mid]<x) l = mid + 1;
            else{
                ans = mid;
                l = mid+1;
            }
        }
        return ans;
    }
}