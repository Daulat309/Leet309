class Solution {
    public int findFinalValue(int[] nums, int k) {
        Arrays.sort(nums);
        int l = nums.length;
        for(int i = 0;i<l;i++){
            if(nums[i]==k) k *= 2;
        }
        return k;
    }
}