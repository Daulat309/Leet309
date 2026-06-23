class Solution {
    public int findMaximizedCapital(int k, int w, int[] p, int[] c) {
        int n = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<p.length;i++){
            if(p[i]>0){
                map.put(i,c[i]);
            }
        }

        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {
                if(p[a]==p[b]) return c[a]-c[b];
                return p[b]-p[a];
            }
        );

        for(Integer i : map.keySet()){
            q.offer(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            if(n>=k) return w;
            int idx = q.poll();
            if(c[idx]<=w){
                n++;
                w += p[idx];
                for(int i = 0;i<list.size();i++){
                    q.offer(list.get(i));
                }
                list.clear(); 
            }
            else{
                list.add(idx);
            }
        }
        return w;
    }
}