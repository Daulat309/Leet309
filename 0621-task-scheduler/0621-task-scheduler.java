class Pair{
    char c;
    int cnt;
    Pair(char c, int cnt){
        this.c = c;
        this.cnt = cnt;
    }
}

class Solution {
    public int leastInterval(char[] t, int n) {
        int k = 1;
        int[] ar = new int[26];
        //Arrays.fill(ar,-1);
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<t.length;i++){
            char c = t[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }

        Queue<Pair> q = new PriorityQueue<>(
            (a,b) -> {
                if(a.cnt == b.cnt) {
                    //if(ar[a.c-'A'] == ar[b.c-'A'])
                    return Character.compare(a.c, b.c);
                //return ar[b.c-'A'] - ar[a.c-'A'];
                }
                return Integer.compare(b.cnt, a.cnt);
                }
            );

        for(Character c : map.keySet()){
            q.offer(new Pair(c,map.get(c)));
        }

        ArrayList<Pair> list = new ArrayList<>();

        while(!q.isEmpty()){
            Pair p = q.poll();
            if(ar[p.c-'A']==0||(k-ar[p.c-'A'])>n){
                ar[p.c-'A'] = k;
                k++;
                if(p.cnt-1>0){
                    q.offer(new Pair(p.c,p.cnt-1));
                }
                if(!list.isEmpty()){
                    for(int i = 0;i<list.size();i++){
                        q.offer(list.get(i));
                    }
                    list.clear();
                }
            }
            else{
                list.add(p);
            }
            if(q.isEmpty()){
                if(!list.isEmpty()){
                    k++;
                    for(int i = 0;i<list.size();i++){
                        q.offer(list.get(i));
                    }
                    list.clear();
                }
                else k--;
            }
        }
        return k;
    }
}