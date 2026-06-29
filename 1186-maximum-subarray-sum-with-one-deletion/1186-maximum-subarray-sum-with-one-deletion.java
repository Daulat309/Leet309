class Solution {
    public int maximumSum(int[] arr) {
        int od = arr[0];
        int nd  = arr[0];
        int mx = Math.max(od,nd);
        for(int i = 1;i<arr.length;i++){
            od = Math.max(nd,od+arr[i]);
            nd = Math.max(arr[i],nd+arr[i]);
            mx = Math.max(mx,Math.max(nd,od));
        }
        return mx;
    }
}