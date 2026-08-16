class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        return Math.max(ro(nums, 0, n-2), ro(nums, 1, n-1));
    }

    public int ro(int[] n, int s, int e){
        if(s>n.length-1||e<0) return 0;
        int p2 = Math.max(0,n[s]);
        if(s+1>n.length-1) return p2;
        int p1 = Math.max(p2, n[s+1]);
        for(int i = s+2;i<=e;i++){
            int cur = Math.max(n[i]+p2, p1);
            p2 = p1;
            p1 = cur;
        }
        return p1;
    }
}