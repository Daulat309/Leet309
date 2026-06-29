class Solution {
    public int characterReplacement(String s, int k) {
        int[] a = new int[26];
        int l = 0, h = 0,res = 0;
        while(h<s.length()){
            a[s.charAt(h)-'A']++;
            int ln = h - l + 1;
            int mx = max(a);
            while(ln-mx>k){
                a[s.charAt(l)-'A']--;
                l++;
                ln = h - l + 1;
                mx = max(a);
            }
            res = Math.max(res,h-l+1);
            h++;
        }
        return res;
    }

    public int max(int[] a){
        int mx = 0;
        for(int i : a) mx = Math.max(mx, i);
        return mx;
    }
}