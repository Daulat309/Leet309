class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int[] suff = new int[n];
        suff[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--)
            suff[i] = Math.max(nums[i + 1], suff[i + 1]);
        int max = 0;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > max || nums[i] > suff[i])
                ans.add(nums[i]);
            max = Math.max(max, nums[i]);
        }
        return ans;
    }
}