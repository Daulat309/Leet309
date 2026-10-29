class Solution {
    public long maximizeSum(int[] nums, int kk) {
        Queue<Integer> qq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b, a)
        );

        long res = 0;

        for (int num : nums) {
            Queue<Integer> qt = new PriorityQueue<>(
                (x, y) -> Integer.compare(y, x)
            );

            int m = num;

            while (m > 0) {
                int d = m % 10;
                qt.add(d);
                m /= 10;
            }

            int k = 0;

            while (!qt.isEmpty()) {
                k = k * 10 + qt.poll();
            }

            res += num;

            qq.offer(k - num);
        }

        while (kk > 0 && !qq.isEmpty()) {
            int gain = qq.poll();

            if (gain <= 0) {
                break;
            }

            res += gain;
            kk--;
        }

        return res;
    }
}
