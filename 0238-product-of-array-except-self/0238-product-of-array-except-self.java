class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] pos = new int[nums.length];
        Arrays.fill(pre,1);
        Arrays.fill(pos,1);
        int mul = 1;
        for(int i = 0;i<nums.length;i++){
            pre[i] = mul;
            mul = mul*nums[i];
        }
        mul = 1;
        for(int i = nums.length-1;i>=0;i--){
            pos[i] = mul;
            mul = mul*nums[i];
        }
        nums[0] = pos[0];
        nums[nums.length-1] = pre[nums.length-1];
        for(int i = 1;i<nums.length-1;i++){
            nums[i] = pos[i]*pre[i];
        }
        return nums;
    }
}