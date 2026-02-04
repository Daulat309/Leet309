class Solution {
    public boolean isTrionic(int[] nums) {
        boolean isit = false;
        int past = nums[0];
        int inc = 0;
        int dec = 0;
        int is = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<past&&inc==0) return false;
            if(nums[i]==past) return false;
            if(nums[i]>past&&is==0){
                inc++;
                is = 1;
            }
            if(nums[i]<past&&is==1){
                dec++;
                is = 0;
            }
            past = nums[i];
        }
        return inc==2&&dec==1;
    }
}