class Solution {
    public boolean uniformArray(int[] nums) {

        int minOdd = Integer.MAX_VALUE;

        // Find minimum odd
        for (int x : nums) {
            if (x % 2 != 0) {
                minOdd = Math.min(minOdd, x);
            }
        }

        // Check even numbers
        for (int x : nums) {
            if (x % 2 == 0 && minOdd != Integer.MAX_VALUE && x < minOdd) {
                return false;
            }
        }

        return true;
    }
}