class Solution {
    public int search(int[] arr, int x) {
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]==x) return mid;
            if(arr[mid]<=arr[h]){
                if(arr[mid]< x && x<=arr[h]) l = mid + 1;
                else h = mid -1;
            }
            else{
                if(arr[l]<=x&&x<arr[mid]) h = mid - 1;
                else l = mid + 1;
            }
        }
        return -1;
    }
}