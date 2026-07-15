class Pair{
    char ch;
    int freq;

    Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

class Solution {
    public String reorganizeString(String s) {
        int[] a = new int[256];
        for(char c : s.toCharArray()) a[c]++;
        Queue<Pair> q = new PriorityQueue<>(
            (x,y) -> {
                return y.freq-x.freq;
            }
        );
        ArrayList<Pair> list = new ArrayList<>();

        for(int i = 0;i<256;i++) if(a[i]!=0) q.offer(new Pair((char)i,a[i]));
        String str = "";
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(str.length()>0){
                if(str.charAt(str.length()-1)==p.ch){
                    list.add(p);
                }
                else{
                    str += p.ch;
                    p.freq = p.freq-1;
                    if(p.freq>0) q.offer(p);
                    if(!list.isEmpty()) q.offer(list.get(0));
                    list.clear();
                }
            }
            else{
                str += p.ch;
                p.freq = p.freq-1;
                if(p.freq>0) q.offer(p);
                if(!list.isEmpty()) q.offer(list.get(0));
                list.clear();
            }

            if(q.isEmpty()&&!list.isEmpty()){
                if(list.get(0).ch!=str.charAt(str.length()-1)){
                    q.offer(list.get(0));
                    list.clear();
                }
            }
        }

        if(str.length()==s.length()) return str;
        return "";

    }
}