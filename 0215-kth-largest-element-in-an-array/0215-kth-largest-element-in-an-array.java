class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue <Integer> q = new PriorityQueue<>();
        for(int i : nums) q.offer(i*-1);
        k--;
        while(k-->0){
            q.poll();
        }
        return q.poll()*-1;
    }
}