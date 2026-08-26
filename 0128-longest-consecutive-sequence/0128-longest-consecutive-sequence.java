class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Store all elements
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : set) {

            // Start of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Build the consecutive sequence
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }
}