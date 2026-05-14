class Solution {
    public boolean isGood(int[] nums) {
        //Arrays.sort(nums);
        int cnt = 0;
        int mn = nums[0];
        int mx = nums[0];
        int n = nums.length;
        int s = nums[0];
        if(nums[0]==n-1) cnt++;
        for(int i = 1;i<nums.length;i++){
            s += nums[i];
            s -= i;
            if(nums[i]==n-1) cnt++;
            mn = Math.min(mn,nums[i]);
            mx = Math.max(mx,nums[i]);
        }
        return s==n-1&&mn==1&&mx==n-1&&cnt==2;
    }
}