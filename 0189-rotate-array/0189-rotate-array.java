class Solution {

    public static void rev(int[] nums, int l, int h){
        while(l<=h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int l = 0;
        int h = nums.length-1;
        rev(nums,0,nums.length-1);
        rev(nums,k,nums.length-1);
        rev(nums,0,k-1);
    }
}