public class Solution {
    static class ClassInfo {
        int pass, total;
        double profit;
        ClassInfo(int p, int t) {
            pass = p;
            total = t;
            profit = ((double)(p + 1) / (t + 1)) - ((double) p / t);
        }
        void addStudent() {
            pass++;
            total++;
            profit = ((double)(pass + 1) / (total + 1)) - ((double) pass / total);
        }
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double total = 0.0;
        PriorityQueue<ClassInfo> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b.profit, a.profit)
        );

        for (int[] c : classes) {
            total += (double) c[0] / c[1];
            pq.offer(new ClassInfo(c[0], c[1]));
        }

        while (extraStudents-- > 0) {
            ClassInfo cur = pq.poll();
            total += cur.profit;
            cur.addStudent();
            pq.offer(cur);
        }

        return total / classes.length;
    }
}