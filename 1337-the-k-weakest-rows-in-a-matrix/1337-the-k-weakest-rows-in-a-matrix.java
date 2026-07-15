class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        for(int i = 0;i<mat.length;i++){
            for(int j = 1;j<mat[i].length;j++){
                mat[i][0] += mat[i][j];
            }
        }

        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {
                if(mat[a][0]==mat[b][0]) return Integer.compare(b,a);
                return mat[b][0] - mat[a][0];
            }
        );

        for(int i = 0;i<mat.length;i++){
            q.offer(i);
            if(q.size()>k) q.poll();
        }
        int[] a = new int[q.size()];
        int i = a.length-1;
        while(!q.isEmpty()){
            a[i] = q.poll();
            i--;
        }
        return a;
    }
}