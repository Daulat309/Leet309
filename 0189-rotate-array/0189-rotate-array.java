class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int l = 0;
        int h = nums.length-1;
        while(l<=h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
        l = k;
        h = nums.length-1;
        while(l<=h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
        l = 0;
        h = k-1;
        while(l<=h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
    }
}