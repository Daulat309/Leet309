class Solution {
    public int maxDistinctElements(int[] arr, int diff) {
        Arrays.sort(arr);
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int a : arr) {
            int x = Math.max(prev + 1, a - diff);
            if (x <= a + diff) {
                count++;
                prev = x;
            }
        }
        return count;
    }
}
