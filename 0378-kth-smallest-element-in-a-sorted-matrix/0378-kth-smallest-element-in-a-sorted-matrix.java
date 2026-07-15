class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {return b - a;}
        );
        for(int[] a : matrix) for(int i : a){
            q.offer(i);
            if(q.size()>k) q.poll();
        }
        return q.poll();
    }
}