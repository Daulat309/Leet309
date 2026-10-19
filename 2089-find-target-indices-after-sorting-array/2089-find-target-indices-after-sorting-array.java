class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i : nums) q.offer(i);
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        while(!q.isEmpty()){
            if(q.poll()==target) list.add(cnt);
            cnt++;
        }
        return list;
    }
}