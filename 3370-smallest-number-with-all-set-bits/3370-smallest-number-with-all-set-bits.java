class Solution {
    public int smallestNumber(int n) {
        int[] arr = new int[11];
        for(int i = 0;i<11;i++){
            arr[i] = (int)Math.pow(2,i) -1;
        }
        for(int i = 0;i<11;i++){
            if(arr[i]>=n) return arr[i];
        }
        return 1023;
    }
}