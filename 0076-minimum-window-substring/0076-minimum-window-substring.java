class Solution {
    public String minWindow(String s, String t) {
        int[] r = new int[256];
        int[] ex = new int[256];
        for(int i = 0;i<t.length();i++) r[t.charAt(i)]++;
        int l = 0, h = 0, mnl = Integer.MAX_VALUE;
        String S = "";
        while(h<s.length()){
            ex[s.charAt(h)]++;
            while(isit(r,ex)){
                String cur = s.substring(l,h+1);
                if(cur.length()<mnl){
                    S = cur;
                    mnl = cur.length();
                }
                ex[s.charAt(l)]--;
                l++;
            }
            h++;
        }
        return S;
    }

    public static boolean isit(int[] r,int[] ex){
        for(int i = 0;i<256;i++) if(r[i]>ex[i]) return false;
        return true;
    }
}