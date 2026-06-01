class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        for(int i = nums.length-2;i>=0;i -= 2){
            s += nums[i];
        }
        return s;
    }
}