class Pair{
    int p;
    int c;
    Pair(int p, int c){
        this.p = p;
        this.c = c;
    }
}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Queue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                return a.c - b.c;
            }
        );
        Queue<Pair> q = new PriorityQueue<>(
            (a,b) -> {
                return b.p - a.p;
            }
        );

        for(int i = 0;i<profits.length;i++){
            pq.offer(new Pair(profits[i], capital[i]));
        }

        int cnt = 0;

        while(cnt<k){
            while(!pq.isEmpty()&&pq.peek().c<=w){
                q.offer(pq.poll());
            }
            if(q.isEmpty()) return w;
            w += q.poll().p;
            cnt++;
        }
        return w;
    }
}