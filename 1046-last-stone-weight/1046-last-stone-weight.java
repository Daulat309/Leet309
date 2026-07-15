class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> { return b-a;}
        );
        for(int i : stones) q.offer(i);
        while(q.size()>1){
            int i = q.poll();
            if(q.size()>1&&q.peek()==i) q.poll();
            else q.offer(i-q.poll());
        }
        return q.poll();
    }
}