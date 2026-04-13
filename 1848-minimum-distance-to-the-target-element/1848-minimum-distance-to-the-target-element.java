class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int l = start, r = start+1;
        while(l>=0&&r<nums.length){
            if(nums[l]==target)return start - l;
            else if(nums[r]==target)return r-start;
            l--;
            r++;
        }
        while(l>=0){
            if(nums[l]==target)return start - l;
            l--;
        }
        while(r<nums.length){
            if(nums[r]==target)return r-start;
            r++;
        }
        return start;
    }
}