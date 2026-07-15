// class Solution {
//     public int minRefuelStops(int target, int startFuel, int[][] stations) {
//         Queue<int[]> q = new PriorityQueue<>(
//             (a,b) -> {
//                 if(b[1]==a[1]) return a[0] - b[0];
//                 return b[1] - a[1];
//             }
//         );
//         ArrayList<int[]> list = new ArrayList<>();
//         for(int[] a : stations) q.offer(a);
//         int cnt = 0;
//         target -= startFuel;
//         int cur = startFuel;
//         while(!q.isEmpty()&&target>0){
//             if(q.peek()[0]<=cur){
//                 target -= q.peek()[1];
//                 cur += q.peek()[1];
//                 q.poll();
//                 cnt++;
//                 if(!list.isEmpty()) for(int i = 0;i<list.size();i++) q.offer(list.get(i));
//                 list.clear();
//             }
//             else{
//                 list.add(q.poll());
//             }
//             if(q.isEmpty()&&target>0) return -1;
//         }
//         return target<=0?cnt:-1;
//     }
// }

class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        int fuel = startFuel;
        int i = 0;
        int ans = 0;

        while (fuel < target) {

            while (i < stations.length && stations[i][0] <= fuel) {
                pq.offer(stations[i][1]);
                i++;
            }

            if (pq.isEmpty())
                return -1;

            fuel += pq.poll();
            ans++;
        }

        return ans;
    }
}