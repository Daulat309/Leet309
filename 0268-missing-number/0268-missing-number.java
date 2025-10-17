class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int total = (n * (n+1))/2;
        int sum = 0;
        for (int x : arr) sum += x;
        return total-sum;
    }
}