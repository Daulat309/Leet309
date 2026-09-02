class Pair{
    String s;
    int c;

    Pair(String s, int c){
        this.s = s;
        this.c = c;
    }
}

class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> set = new HashSet<>();

        for(String s : deadends) set.add(s);

        if (target.equals("0000")) {
            return 0;
        }
        if (set.contains("0000")) {
            return -1;
        }

        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair("0000",0));
        set.add("0000");

        while(!q.isEmpty()){
            int l = q.size();
            Pair p = q.poll();
            String st = p.s;
            int ct = p.c;

            char[] ar = st.toCharArray();
            for(int i = 0;i<4;i++){

                char ch = ar[i];

                int k = ar[i]-'0'+1;
                if(k<10){
                    ar[i] = (char)(k+'0');
                    String ns = new String(ar);
                    if(ns.equals(target)) return ct+1;
                    if(!set.contains(ns)){
                        set.add(ns);
                        q.offer(new Pair(ns, ct+1));
                    }
                    ar[i] = ch;
                }
                k = ar[i]-'0'-1;
                if(k==-1) k = 9;
                if(k>=0){
                    ar[i] = (char)(k+'0');
                    String ns = new String(ar);
                    if(ns.equals(target)) return ct+1;
                    if(!set.contains(ns)){
                        set.add(ns);
                        q.offer(new Pair(ns, ct+1));
                    }
                    ar[i] = ch;
                }
            }
        }

        return -1;
        
    }
}