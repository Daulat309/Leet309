class Solution {
    public int lengthOfLongestSubstring(String s) {
        int mx = 0;
        int l = 0, h = 0;
        int[] a = new int[128];
        while(h<s.length()){
            if(a[s.charAt(h)]>0){
                while(s.charAt(l)!=s.charAt(h)){
                    a[s.charAt(l)]--;
                    l++;
                }
                a[s.charAt(l)]--;
                l++;
            }
            a[s.charAt(h)]++;
            mx = Math.max(h-l+1,mx);
            h++;
        }
        return mx;
    }
}