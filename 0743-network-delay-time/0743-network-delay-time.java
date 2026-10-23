
import java.util.*;

class Pair {
    int dest;
    int tm;

    Pair(int dest, int tm) {
        this.dest = dest;
        this.tm = tm;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<Pair>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] a : times) {
            list.get(a[0]).add(new Pair(a[1], a[2]));
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(a.tm, b.tm));


        pq.offer(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair p = pq.poll();

            int cn = p.dest;
            int ct = p.tm;

            if (ct > dist[cn]) {
                continue;
            }

            for (Pair pp : list.get(cn)) {
                int next = pp.dest;
                int newTime = ct + pp.tm;

                if (newTime < dist[next]) {
                    dist[next] = newTime;
                    pq.offer(new Pair(next, newTime));
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            ans = Math.max(ans, dist[i]);
        }

        return ans;
    }
}
