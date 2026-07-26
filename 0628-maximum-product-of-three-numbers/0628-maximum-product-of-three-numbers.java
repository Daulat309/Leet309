class Solution {
    public int maximumProduct(int[] nums) {
        int mn1 = Integer.MAX_VALUE, mn2 = Integer.MAX_VALUE;
        int mx1 = Integer.MIN_VALUE, mx2 = Integer.MIN_VALUE, mx3 = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>mx1){
                mx3 = mx2;
                mx2 = mx1;
                mx1 = nums[i];
            }
            else if(nums[i]>mx2){
                mx3 = mx2;
                mx2 = nums[i];
            }
            else mx3 = Math.max(mx3,nums[i]);
            if(nums[i]<mn1){
                mn2 = mn1;
                mn1 = nums[i];
            }
            else mn2 = Math.min(mn2,nums[i]);
        }
        return Math.max(mx1*mx2*mx3, mn1*mn2*mx1);
    }
}