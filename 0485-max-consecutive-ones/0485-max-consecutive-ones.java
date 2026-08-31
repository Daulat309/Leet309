class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mx = 0;
        int cnt = -1;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]==1&&cnt==-1) cnt = i;
            else if (nums[i]==0){
                if(cnt!=-1){
                    mx = Math.max(i-cnt,mx);
                }
                cnt = -1;
            }
        }
        if(cnt!=-1) mx = Math.max(n-cnt,mx);
        return mx;
    }
}