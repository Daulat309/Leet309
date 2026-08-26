class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0) return 0;
        int mx = 1;
        int l = 0, h = 1;
        System.out.println(Arrays.toString(nums));
        while(h<n){
            if(nums[h]==nums[h-1]){
                l++;
                h++;
                continue;
            }
            if(nums[h]>nums[h-1]+1){
                mx = Math.max(mx, h-l);
                l = h;
            }
            h++;
        }
        mx = Math.max(mx, h-l);
        return mx;
    }
}