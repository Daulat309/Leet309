class Solution {
    public int[] buildArray(int[] nums) {
        int[] ar = new int[nums.length];
        for(int i = 0;i<ar.length;i++) ar[i] = nums[nums[i]];
        return ar;
    }
}