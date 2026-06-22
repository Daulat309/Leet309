// class Pair{
//     int f;
//     int s;
//     Pair(int a, int b){
//         f = a;
//         s = b;
//     }
// }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {
                return map.get(a) - map.get(b);
            }
        );

        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            q.offer(entry.getKey());
            if(q.size()>k){
                q.poll();
            }
        }
        int[] a = new int[k];
        int i = 0;
        while(!q.isEmpty()){
            a[i] = q.poll();
            i++;
        }
        return a;
    }
}