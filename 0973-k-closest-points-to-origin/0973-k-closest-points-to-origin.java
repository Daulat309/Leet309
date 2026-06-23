class Solution {
    public int[][] kClosest(int[][] p, int k) {
        HashMap<Integer, Double> map = new HashMap<>();
        Queue<Integer> q = new PriorityQueue<>(
            (a,b)->{
                if(map.get(a).equals(map.get(b))) return b.compareTo(a);
                return map.get(b).compareTo(map.get(a));
            }
        );

        for(int i = 0;i<p.length;i++){
            int x = p[i][0];
            int y = p[i][1];
            double d = (double)Math.sqrt((x*x)+(y*y));
            map.put(i,d);
        }

        for(Integer key : map.keySet()){
            q.offer(key);
            if(q.size()>k){
                q.poll();
            }
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