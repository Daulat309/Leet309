class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[256];
        int l = 0, h = 0, rq = t.length(), mn = Integer.MAX_VALUE;
        String S = "";
        for(char c : t.toCharArray()) freq[c]++;
        while(h<s.length()){
            if(freq[s.charAt(h)]>0){
                rq--;
            }
            freq[s.charAt(h)]--;
            while(rq==0){
                if(h - l + 1< mn){
                    S = s.substring(l,h+1);
                    mn = h - l + 1;
                }
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)]>0){
                   rq++;
                }
                l++;
            }
            h++;
        }
        return S;
    }
}