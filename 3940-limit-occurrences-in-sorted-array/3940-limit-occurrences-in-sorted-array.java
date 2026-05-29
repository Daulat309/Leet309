class Solution {
    public int[] limitOccurrences(int[] n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 1;
        int p = n[0];
        list.add(p);
        for(int i = 1;i<n.length;i++){
            if(n[i]==p){
                if(cnt>=k) continue;
                list.add(p);
                cnt++;
            }
            else{
                p = n[i];
                list.add(p);
                cnt = 1;
            }
        }
        int[] r = new int[list.size()];
        for(int i = 0;i<r.length;i++) r[i] = list.get(i);
        return r;
    }
}