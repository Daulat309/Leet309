class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int l = Math.max(i-k,0);
            int r = Math.min(i+k,n-1);
            for(int j = Math.max(i+1,l);j<i;j++) if(nums[i]==nums[j]) return true;
            for(int j = i+1;j<=r;j++) if(nums[i]==nums[j]) return true;
        }
        return false;
    }
}