class Pair{
    char ch;
    int pos;
    int freq;

    Pair(char ch, int pos, int freq){
        this.ch = ch;
        this.pos = pos;
        this.freq = freq;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : tasks) map.put(c,map.getOrDefault(c,0)+1);
        Queue<Pair> q = new PriorityQueue<>(
            (a,b) ->{
                return b.freq-a.freq;
            }
        );

        for(Character c : map.keySet()){
            q.offer(new Pair(c,-1,map.get(c)));
        }
        ArrayList<Pair> list = new ArrayList<>();
        int cnt = 1;
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p.pos!=-1){
                if(cnt - p.pos<=n){
                    list.add(p);
                }
                else{
                    p.pos = cnt;
                    p.freq = p.freq-1;
                    if(p.freq>0) q.offer(p);
                    cnt++;
                    if(!list.isEmpty()){
                        for(int i = 0;i<list.size();i++) q.offer(list.get(i));
                        list.clear();
                    }
                }
            }
            else{
                p.pos = cnt;
                p.freq = p.freq-1;
                if(p.freq>0) q.offer(p);
                cnt++;
                if(!list.isEmpty()){
                    for(int i = 0;i<list.size();i++) q.offer(list.get(i));
                    list.clear();
                }
            }
            if(q.isEmpty()&&!list.isEmpty()){
                cnt++;
                if(!list.isEmpty()){
                    for(int i = 0;i<list.size();i++) q.offer(list.get(i));
                    list.clear();
                }
            }
        }
        return cnt-1;
    }
}