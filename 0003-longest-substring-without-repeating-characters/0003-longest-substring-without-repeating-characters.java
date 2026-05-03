class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int l = 0, h = 0, mxl = l;
        while(h<s.length()){
            int k = h - l + 1;
            char ch = s.charAt(h);
            freq.put(ch,freq.getOrDefault(ch,0)+1);


            while(freq.size()<k){
                char c = s.charAt(l);
                freq.put(c,freq.get(c)-1);
                if(freq.get(c)==0) freq.remove(c);
                l++;
                k = h - l + 1;
            }
            if(freq.size()==k) mxl = Math.max(mxl,k);
            h++;
        }
        return mxl;
    }
}