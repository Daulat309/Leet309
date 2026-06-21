class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue <Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) q.offer(i);
        k--;
        while(k-->0){
            q.poll();
        }
        return q.poll();
    }
}