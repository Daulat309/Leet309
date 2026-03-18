class Solution {
    public boolean search(int[] arr, int x) {
        int pivt = pvt(arr);
        if(pivt==-1) return bs(arr, x, 0, arr.length-1);
        else if(arr[pivt]==x) return true;
        else if(x>=arr[0]) return bs(arr, x, 0, pivt);
        else return bs(arr, x, pivt+1, arr.length-1);
    }

    public static int pvt(int[] arr){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l + (h-l)/2;

            if(l<mid && arr[mid]<arr[mid-1]) return mid -1;
            if(h>mid && arr[mid]>arr[mid+1]) return mid;

            if(arr[mid]==arr[l]&&arr[mid]==arr[h]){
                if(l<h&&arr[l]>arr[l+1]) return l;
                l++;
                if(h>l&&arr[h]<arr[h-1]) return h-1;
                h--;
            }
            else{
                if((arr[l]<arr[mid])||(arr[l]==arr[mid])&&arr[mid]>arr[h]) l = mid +1;
                else h = mid -1;
            }
        }
        return -1;
    }

    public static boolean bs(int[] arr, int x, int l, int h){
        while(l<=h){
            int mid = l + (h-l)/2;
            if(arr[mid]==x) return true;
            else if(arr[mid]>x) h = mid -1;
            else l = mid + 1;
        }
        return false;
    }
}