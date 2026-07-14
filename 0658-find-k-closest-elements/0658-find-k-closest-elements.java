class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Integer> q = new PriorityQueue<>(
            (a,b) ->{
                if(Math.abs(arr[a]-x)==Math.abs(arr[b]-x)) return arr[b]-arr[a];
                return Math.abs(arr[b]-x) - Math.abs(arr[a]-x);
            }
        );
        for(int i = 0;i<arr.length;i++){
            q.offer(i);
            if(q.size()>k) q.poll();
        }
        ArrayList<Integer>list = new ArrayList<>();
        while(!q.isEmpty()){
            list.add(arr[q.poll()]);
        }
        
        Collections.sort(list);
        return list;
    }
}