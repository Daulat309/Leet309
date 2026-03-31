class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p = 0,q = 0,cnt = 0;
        while(p<g.length&&q<s.length){
            if(g[p]<=s[q]){
                cnt++;
                p++;
                q++;
            }
            else q++;
        }
        return cnt;
    }
}