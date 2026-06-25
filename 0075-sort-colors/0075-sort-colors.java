class Solution {
    public void sortColors(int[] nums) {
        int l = 0, md = 0, h = nums.length-1;
        while(md<=h){
            if(nums[md]==0){
                int a = nums[l];
                nums[l] = 0;
                nums[md] = a;
                l++;
                md++;
            }
            else if(nums[md]==1) md++;
            else{
                int a = nums[h];
                nums[md] = a;
                nums[h] = 2;
                h--;
            }
        }
    }
}