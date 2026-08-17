class Pair{
    String ss;
    int cc;

    Pair(String ss, int cc){
        this.ss = ss;
        this.cc = cc;
    }
}
class Solution {
    public int ladderLength(String bw, String ew, List<String> wl) {
        HashMap<String, Integer> mp = new HashMap<>();
        for(String s : wl){
            mp.put(s,1);
        }
        mp.put(bw, 1);
        Queue<Pair> q = new ArrayDeque<>();
        if(!mp.containsKey(ew)) return 0;
        q.offer(new Pair(bw, 1));
        mp.remove(bw);

        while(!q.isEmpty()){

            Pair p = q.poll();
            String s = p.ss;
            int ct = p.cc;
            char[] arr = s.toCharArray();
            for(int i  = 0;i<s.length();i++){
                char ch = arr[i];
                for(char c = 'a';c<='z';c++){
                    if(arr[i]==c) continue;
                    arr[i] = (char)c;
                    String str = new String(arr);
                    if(str.equals(ew)) return ct+1;
                    if(mp.containsKey(str)){
                        q.offer(new Pair(str, ct + 1));
                        mp.remove(str);
                    }
                }
                arr[i] = (char)ch;
            }
        }
        return 0;
    }
}