class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] r = new int[mat.length];
        int i = 0;
        for(int[] a : mat){
            for(int j : a) r[i] += j;
            i++;
        }

        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {
                if(r[a]==r[b]) return b - a;
                return r[b] - r[a];
            }
        );

        for(int l = 0;l<r.length;l++){
            q.offer(l);
            if(q.size()>k) q.poll();
        }
        int[] res = new int[k];
        i = k-1;
        while(!q.isEmpty()){
            res[i] = q.poll();
            i--;
        }
        return res;
    }
}