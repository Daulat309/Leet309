class Solution {
    public int search(int[] arr, int x) {
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]<arr[h]){
                if(arr[mid]<=x&&x<=arr[h]) return bs(arr, x, mid, h);
                else h = mid -1;
            }
            else{
                if(arr[l]<=x&&x<=arr[mid]) return bs(arr, x, l, mid);
                else l = mid + 1;
            }
        }
        return -1;
    }

    public static int bs(int[] arr, int x, int l, int h){
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]>x) h = mid-1;
            else l = mid + 1;
        }
        return -1;
    }
}