class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int cnt = 0, n = s.length();
        int l = 0, h = 0;
        int vl = n;
        int mx = Integer.MAX_VALUE;
        String res = "";
        while(h<n){
            if(s.charAt(h)=='1') cnt++;
            while(cnt==k){
                if((h - l + 1)<=mx){

                    if((h - l + 1)<mx){
                       String cur = s.substring(l,h+1); 
                       mx = h - l + 1;
                       res = cur;
                    }
                    else{
                       String cur = s.substring(l,h+1); 
                       int c = cur.compareTo(res);
                       if(c<=0){
                        res = cur;
                       }
                    }
                }
                if(s.charAt(l)=='1') cnt--;
                l++;
            }
            h++;
        }
        return res;
    }
}