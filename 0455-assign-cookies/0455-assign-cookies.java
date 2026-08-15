class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int h = 0, l = 0;
        while(h<s.length&&l<g.length){
            if(s[h]>=g[l]){
                l++;
            }
            h++;
        }
        return l;
    }
}