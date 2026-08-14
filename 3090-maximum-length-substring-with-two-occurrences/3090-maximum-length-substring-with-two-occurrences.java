class Solution {
    public int maximumLengthSubstring(String s) {
        int[] f = new int[256];
        int l = 0, h = 0, mx = 0;
        while(h<s.length()){
            char c = s.charAt(h);
            f[c]++;
            while(f[c]>2){
                char cl = s.charAt(l);
                f[cl]--;
                l++;
            }
            mx = Math.max(mx, h-l+1);
            h++;
        }
        return mx;
    }
}