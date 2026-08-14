class Solution {
    public int maximumLengthSubstring(String s) {
        int[] f = new int[256];
        int l = 0, mx = 0;
        for(int h = 0;h<s.length();h++){
            char c = s.charAt(h);
            f[c]++;
            while(f[c]>2){
                char cl = s.charAt(l);
                f[cl]--;
                l++;
            }
            mx = Math.max(mx, h-l+1);
        }
        return mx;
    }
}