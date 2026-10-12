class Pair{
    int key;
    int val;

    Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Map<Integer, Integer> mp = new TreeMap<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        Queue<Pair> q = new ArrayDeque<>();
        for(int key : mp.keySet()){
            q.offer(new Pair(key, mp.get(key)));
        }
        int[] res = new int[nums.length];
        int k = 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            res[k++] = p.key;
            if(p.val!=1) q.offer(new Pair(p.key, p.val-1));
        }
        return res;

    }
}