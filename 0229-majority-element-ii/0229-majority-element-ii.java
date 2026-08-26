class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int k = n / 3 + 1;

        for (int i = 0; i + k - 1 < n; i++) {
            if (nums[i] == nums[i + k - 1]) {
                list.add(nums[i]);

                int j = i + k;
                while (j < n && nums[j] == nums[i]) {
                    j++;
                }
                i = j - 1;
            }
        }

        return list;
    }
}