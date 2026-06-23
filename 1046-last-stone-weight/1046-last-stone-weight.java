class Solution {
    public int lastStoneWeight(int[] s) {
        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {return b - a;}
        );
        for(int i : s) q.offer(i);
        while(!q.isEmpty()){
            int a = q.poll();
            if(!q.isEmpty()){
                int b = q.poll();
                if(a!=b) q.offer(a-b);
            }
            else return a;
        }
        return 0;
    }
}