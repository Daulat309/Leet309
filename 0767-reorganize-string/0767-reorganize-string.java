class Pair{
    char f;
    int s;
    Pair(char f, int s){
        this.f = f;
        this.s = s;
    }
}

class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Queue<Pair> q = new PriorityQueue<>(
            (a,b) -> {if(a.s==b.s) return a.f-b.f;
            return Integer.compare(b.s,a.s);
            }
        );

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            q.offer(new Pair(entry.getKey(),entry.getValue()));
        }

        StringBuilder sb = new StringBuilder();

        while(!q.isEmpty()){
            Pair p = q.peek();
            if(!sb.isEmpty()){
                if(sb.charAt(sb.length()-1)!=p.f){
                    sb.append(p.f);
                    q.poll();
                    if(p.s-1!=0) q.offer(new Pair(p.f,p.s-1));
                }
                else{
                    q.poll();
                    if(!q.isEmpty()){
                        Pair r = q.peek();
                        sb.append(r.f);
                        q.poll();
                        if(r.s-1!=0) q.offer(new Pair(r.f,r.s-1));
                        q.offer(p);
                    }
                }
            }
            else{
                sb.append(p.f);
                q.poll();
                if(p.s-1!=0) q.offer(new Pair(p.f,p.s-1));
            }
        }
        String res = sb.toString();
        return res.length()==s.length()?res:"";
    }
}