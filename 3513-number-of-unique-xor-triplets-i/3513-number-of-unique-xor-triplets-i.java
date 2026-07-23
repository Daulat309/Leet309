class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int mx = Arrays.stream(nums).max().getAsInt();
        int bits = (int)(Math.log(mx) / Math.log(2)) + 1;
        return nums.length>=3?(int) Math.pow(2,bits) : (int) Math.pow(2,bits-1);
    }
}