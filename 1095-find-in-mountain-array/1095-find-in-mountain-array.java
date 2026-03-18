/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int pk = peak(arr);
        int fst = bs(arr,target,0,pk);
        if(fst!=-1) return fst;
        return bs(arr, target, pk+1, arr.length()-1);
    }

    public static int peak(MountainArray arr){
        int l = 0;
        int h = arr.length()-1;
        while(l<h){
            int mid = l + (h-l)/2;
            if(arr.get(mid)>arr.get(mid+1)) h = mid;
            else l = mid + 1;
        }
        return l;
    }

    public static int bs(MountainArray arr, int x,int s, int e){
        boolean isAsc = arr.get(s)<=arr.get(e);
        while(s<=e){
            int mid = s + (e - s)/2;
            if(arr.get(mid)==x) return mid;
            if(isAsc){
                if(arr.get(mid)>x) e = mid -1;
                else s = mid + 1;
            }
            else{
                if(arr.get(mid)>x) s = mid + 1;
                else e = mid -1;
            }
        }
        return -1;
    }
}