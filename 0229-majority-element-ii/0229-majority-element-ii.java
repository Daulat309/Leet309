class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int required = n / 3 + 1;

        int count = 1;

        for (int i = 1; i <= n; i++) {

            if (i < n && nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count >= required) {
                    list.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        return list;
    }
}