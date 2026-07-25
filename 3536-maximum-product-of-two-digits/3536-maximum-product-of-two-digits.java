class Solution {
    public int maxProduct(int n) {
        Queue<Integer> q = new PriorityQueue<>();
        while(n!=0){
            q.offer(n%10);
            if(q.size()>2) q.poll();
            n /= 10;
        }
        return q.poll()*q.poll();
    }
}