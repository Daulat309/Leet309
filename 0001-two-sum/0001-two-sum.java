class Pair {
    int val, idx;

    Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Pair[] arr = new Pair[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a.val, b.val));

        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l].val + arr[r].val;

            if (sum == target) {
                return new int[]{arr[l].idx, arr[r].idx};
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        return new int[]{-1, -1};
    }
}