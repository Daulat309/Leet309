class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int l = 0, h = 0, mxl = l;
        while(h<s.length()){
            char ch = s.charAt(h);
            freq.put(ch,freq.getOrDefault(ch,0)+1);

            while (freq.get(ch) > 1) {
                char left = s.charAt(l++);
                freq.put(left, freq.get(left) - 1);
            }
            mxl = Math.max(mxl,h-l+1);
            h++;
        }
        return mxl;
    }
}