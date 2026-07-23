class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int mx = Arrays.stream(nums).max().getAsInt();
        return nums.length>=3?(int) Math.pow(2,Integer.toBinaryString(mx).length()): (int) Math.pow(2,Integer.toBinaryString(mx).length()-1);
    }
}