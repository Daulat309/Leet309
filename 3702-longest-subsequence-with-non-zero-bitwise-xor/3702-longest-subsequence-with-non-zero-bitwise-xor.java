class Solution {
    public int longestSubsequence(int[] nums) {
        int x = 0;
        boolean isit = false;
        for(int i : nums){
            x ^= i;
            if(i!=0) isit = true;
        }
        return x==0 ? isit ? nums.length-1:0:nums.length;
    }
}