class Solution {
    public int closestTarget(String[] w, String t, int s) {
        //int l = Math.max(0,s-1), h = Math.min(s+1,w.length-1);
        if(w[s].equals(t)) return 0;
        int n = w.length;
        for(int i = 0;i<w.length;i++){
            int l = (s-i+n)%n;
            int h = (s+i)%n;
            if(w[l].equals(t)||w[h].equals(t)) return i;
        }
        return -1;
    }
}