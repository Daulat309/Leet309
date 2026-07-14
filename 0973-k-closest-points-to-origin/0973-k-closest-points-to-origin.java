class Solution {
    public int[][] kClosest(int[][] p, int k) {
        Queue<Integer> q = new PriorityQueue<>(
            (a,b)->{
                double d2 = (double)p[b][0]*p[b][0]+(p[b][1]*p[b][1]);
                double d1 = (double)p[a][0]*p[a][0]+(p[a][1]*p[a][1]);
                return Double.compare(d2,d1);
            }
        );

        for(int i = 0;i<p.length;i++){
            q.offer(i);
            if(q.size()>k) q.poll();
        }
        int[][] res = new int[k][2];
        int i = k - 1;
        while(!q.isEmpty()){
            int[]  a = p[q.poll()];
            res[i][0] = a[0];
            res[i][1] = a[1];
            i--;
        }
        return res;
    }
}