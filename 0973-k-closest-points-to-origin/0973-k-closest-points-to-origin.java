class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer , Double> map = new HashMap<>();
        for(int i = 0;i<points.length;i++){
            int[] a = points[i];
            double d = Math.sqrt(a[0]*a[0]+a[1]*a[1]);
            map.put(i,d);
        }

        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {
                if(map.get(a).equals(map.get(b))) return Integer.compare(b,a);
                return Double.compare(map.get(b),map.get(a));
            }
        );

        for(Integer i : map.keySet()){
            q.offer(i);
            if(q.size()>k) q.poll();
        }

        int[][] res = new int[q.size()][2];
        int i = q.size()-1;
        while(!q.isEmpty()){
            int[] a = points[q.poll()];
            res[i][0] = a[0];
            res[i][1] = a[1];
            i--;
        }
        return res;
    }
}