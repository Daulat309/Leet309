class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        if(arr[0]!=0) return 0;
        for(int i = 1;i<n;i++){
            if(arr[i]!=i)
            return i;
        }
        return n;
    }
}