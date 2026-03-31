class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0,h = nums.length-1;
        while(l<=h){
            if((nums[l]&1)==1&&(nums[h]&1)!=1){
                nums[l] = nums[l]^nums[h];
                nums[h] = nums[l]^nums[h];
                nums[l] = nums[l]^nums[h];
                l++;
                h--;
            }
            if((nums[l]&1)!=1){
                l++;
            }
            if((nums[h]&1)==1){
                h--;
            }
        }
        return nums;
    }
}