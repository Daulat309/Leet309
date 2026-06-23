class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> {
                if(Math.abs(a-x)==(Math.abs(b-x))) return b - a;
                return Math.abs(b-x) - Math.abs(a-x);
            }
        );
        for(int i : arr){
            q.offer(i);
            if(q.size()>k) q.poll();
        }
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        Collections.sort(list);
        return list;
    }
}