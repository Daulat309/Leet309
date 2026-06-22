class Pair{
    int f;
    int s;
    Pair(int a, int b){
        f = a;
        s = b;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new PriorityQueue<>(
            (a,b) -> {
                return b.s - a.s;
            }
        );

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            q.offer(new Pair(entry.getKey(),entry.getValue()));
        }
        int[] a = new int[k];
        int i = 0;
        while(i!=k&&!q.isEmpty()){
            a[i] = q.peek().f;
            q.poll();
            i++;
        }
        return a;
    }
}