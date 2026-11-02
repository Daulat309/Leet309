class Solution {
    public int minMoves2(int[] nums) {

        Queue<Integer> q = new PriorityQueue<>(
            (a, b) -> b - a
        );

        int k = nums.length / 2;

        for (int num : nums) {
            q.offer(num);

            if (q.size() > k + 1) {
                q.poll();
            }
        }

        int md = q.peek();

        int res = 0;

        for (int num : nums) {
            res += Math.abs(md - num);
        }

        return res;
    }
}