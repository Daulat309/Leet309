class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, h = 0, mx = 0;
        while(h<s.length()){
            map.put(s.charAt(h),map.getOrDefault(s.charAt(h),0)+1);
            while(map.size()<(h - l + 1)){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0) map.remove(s.charAt(l));
                l++;
            }
            mx = Math.max(h-l+1,mx);
            h++;
        }
        return mx;
    }
}