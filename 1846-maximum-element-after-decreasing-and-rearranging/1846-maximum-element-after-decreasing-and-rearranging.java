class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int[] a = new int[arr.length+1];
        int n = arr.length;
        for(int i : arr){
            a[Math.min(i,n)]++;
        }
        int res = 0;
        for(int i = 1;i<a.length;i++){
            res = Math.min(res+a[i],i);
        }
        return res;
    }
}