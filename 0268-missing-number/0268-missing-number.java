class Solution {
    public int missingNumber(int[] arr) {
        int s = (arr.length*(arr.length+1))/2;
        for(int i = 0;i<arr.length;i++) s -= arr[i];
        return s;
    }
}