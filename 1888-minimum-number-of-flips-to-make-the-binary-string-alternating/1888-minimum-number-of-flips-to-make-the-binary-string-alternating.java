class Solution {
    public int minFlips(String ss) {
        StringBuilder s = new StringBuilder(ss);
        int ii = 0;
        while(s.charAt(0)!=s.charAt(ss.length()-1)){
            char c = s.charAt(0);
            s.deleteCharAt(0);
            s.append(c);
            ii++;
            if(ii==s.length()-1) break;
        }
        System.out.println(s.toString());
        char pst = s.charAt(0);
        int cnt = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==pst){
                cnt++;
                pst = s.charAt(i)=='1'?'0':'1';
            }
            else pst = s.charAt(i);
        }
        return Math.min(s.length() - cnt,cnt);
    }
}