class Solution {
    public int maximumLengthSubstring(String s) {
        int[] f = new int[26];
        int l = 0, mx = 0;
        for(int h = 0;h<s.length();h++){
            char c = s.charAt(h);
            f[c-'a']++;
            while(f[c-'a']>2){
                char cl = s.charAt(l);
                f[cl-'a']--;
                l++;
            }
            mx = Math.max(mx, h-l+1);
        }
        return mx;
    }
}