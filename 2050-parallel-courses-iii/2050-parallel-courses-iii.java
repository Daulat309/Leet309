class Solution {
    public int minimumTime(int n, int[][] rl, int[] tm) {
        int mx = 0;

        int[] in = new int[n];
        int[] dp = new int[n];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
            dp[i] = tm[i];
        }

        for (int[] a : rl) {
            list.get(a[0] - 1).add(a[1] - 1);
            in[a[1] - 1]++;
        }

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (in[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int i = q.poll();

            mx = Math.max(mx, dp[i]);

            for (int k : list.get(i)) {
                dp[k] = Math.max(dp[k], dp[i] + tm[k]);

                in[k]--;

                if (in[k] == 0) {
                    q.offer(k);
                }
            }
        }

        return mx;
    }
}