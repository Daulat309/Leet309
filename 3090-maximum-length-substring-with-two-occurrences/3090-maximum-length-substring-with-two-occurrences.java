class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int l = 0, h = 0, mx = 0;
        while(h<s.length()){
            char c = s.charAt(h);
            mp.put(c,mp.getOrDefault(c,0)+1);
            while(mp.get(c)>2){
                char cl = s.charAt(l);
                mp.put(cl, mp.get(cl)-1);
                if(mp.get(cl)==0) mp.remove(cl);
                l++;
            }
            mx = Math.max(mx, h-l+1);
            h++;
        }
        return mx;
    }
}