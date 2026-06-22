class Solution {
    public int thirdMax(int[] nums) {
        Queue<Integer> q = new PriorityQueue<>();
        int k = 3;
        HashSet<Integer> set = new HashSet<>();

        int mx = Integer.MIN_VALUE;
        for(int i : nums){
            if(!set.contains(i)){
                System.out.println(i);
                q.offer(i);
                set.add(i);
                k--;
            }
            mx = Math.max(i,mx);
            if(k<0){
                q.poll();
                k++;
            }
            System.out.println(q.peek());
        }
        System.out.println(q.peek());
        return k>0?mx:q.poll();
    }
}