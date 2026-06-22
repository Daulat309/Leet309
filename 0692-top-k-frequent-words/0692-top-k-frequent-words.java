class Solution {
    public List<String> topKFrequent(String[] w, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        Queue<String> q = new PriorityQueue<>(
            (a,b) ->{
                if (map.get(a).equals(map.get(b))) return b.compareTo(a);
                return map.get(a)-map.get(b);
            }
        );

        for(String s : w){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String s : map.keySet()){
            q.offer(s);
            if(q.size()>k)q.poll();
        }
        List<String> list = new ArrayList<>();
        while(!q.isEmpty()){
            System.out.println(q.peek()+"  -> "+map.get(q.peek()));
            list.add(q.poll());
        }
        System.out.println(list);
        Collections.reverse(list);
        return list;
    }
}