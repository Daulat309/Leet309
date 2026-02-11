class Solution {
    public int dominantIndices(int[] nums) {
        int l = nums.length;
        int count = 0;
        int av = 1;
        int sum = nums[l-1];
        for(int i = l-2;i>=0;i--){
            if(nums[i]>sum/av) count++;
            av++;
            sum += nums[i];
        }
        return count;
    }
}