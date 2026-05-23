class Solution {
    public boolean check(int[] nums) {
        int s = 0;
        int l = nums.length;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                s = i+1;
                break;
            }
        }
        int i = s;
       while((i+1)%l!=s%l){
            if(nums[i%l]>nums[(i+1)%l]) return false;
            i++;
        }
        return true;
    }
}