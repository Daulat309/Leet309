class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int n = nums[i];
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {
                if(map.get(a).equals(map.get(b))) return a-b;
                return Integer.compare(map.get(a), map.get(b));
            }
        );

        for(Integer i : map.keySet()){
            q.offer(i);
            if(q.size()>k) q.poll();
        }
        int[] a = new int[k];
        for(int i = a.length-1;i>=0;i--){
            a[i] = q.poll();
        }
        return a;
    }
}