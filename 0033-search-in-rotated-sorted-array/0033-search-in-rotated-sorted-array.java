class Solution {

    public int search(int[] ar, int x) {
        int l = 0;
        int h = ar.length - 1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(ar[mid]==x) return mid;

            if(ar[l]<=ar[mid]){
                if(ar[l]<=x&&x<=ar[mid]) h = mid-1;
                else l = mid + 1;
            }
            else{
                if(x<=ar[h]&&ar[mid]<x) l = mid + 1;
                else h = mid-1;
            }
        }
        return -1;
    }
}
