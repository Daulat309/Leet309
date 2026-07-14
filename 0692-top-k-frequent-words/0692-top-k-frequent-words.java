class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0;i<words.length; i++){
            String s = words[i];
            map.put(s,map.getOrDefault(s,0)+1);
        }

        Queue<String> q = new PriorityQueue<>(
    (a, b) -> {
        if (map.get(a).equals(map.get(b))) {
            return b.compareTo(a);
        }
        return Integer.compare(map.get(a), map.get(b));
    }
);

        for(String key : map.keySet()){
            q.offer(key);
            if(q.size()>k) q.poll();
        }
        ArrayList<String> list = new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.poll());
        }
        Collections.reverse(list);
        return list;
    }
}