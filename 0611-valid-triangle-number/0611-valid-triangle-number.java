class Solution {
    public int triangleNumber(int[] nums) {
        int l = nums.length;
        int a,b,c;
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < l - 2; i++) {
            a = nums[i];
            for (int j = i + 1; j < l - 1; j++) {
                b = nums[j];
                for (int k = j + 1; k < l; k++) {
                    c = nums[k];
                    if (a + b > c) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
