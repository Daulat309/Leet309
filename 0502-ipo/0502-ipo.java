class Solution {
    public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
        int[][] a = new int[p.length][2];
        for(int i = 0;i<p.length;i++){
            a[i][0] = c[i];
            a[i][1] = p[i];
        }
        Arrays.sort(a,(r,s) -> Integer.compare(r[0],s[0]));
        Queue<Integer> q = new PriorityQueue<>(
            (r,s) -> {
                return s-r;
            }
        );
        int idx = 0;
        while(k-->0){
            while(idx<a.length){
                if(a[idx][0]>w) break;
                else{
                    q.offer(a[idx][1]);
                    idx++;
                }
            }
            if(q.isEmpty()) return w;
            w += q.poll();
        }
        return w;
    }
}

// class Solution {
//     public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
//         Queue<Integer> q = new PriorityQueue<>(
//             (a,b) -> {
//                 if(p[a]==p[b]) return c[a]-c[b];
//                 return p[b]-p[a];
//             }
//         );

//         for(int i = 0;i<p.length;i++){
//             if(p[i]>0){
//                 q.offer(i);
//             }
//         }
        
//         ArrayList<Integer> list = new ArrayList<>();
//         while(!q.isEmpty()){
//             if(k==0) return w;
//             int idx = q.poll();
//             if(c[idx]<=w){
//                 k--;
//                 w += p[idx];
//                 for(int i = 0;i<list.size();i++){
//                     q.offer(list.get(i));
//                 }
//                 list.clear(); 
//             }
//             else{
//                 list.add(idx);
//             }
//         }
//         return w;
//     }
// }