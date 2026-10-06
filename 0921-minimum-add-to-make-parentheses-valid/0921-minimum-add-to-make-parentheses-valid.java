class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0;
        int c = 0;
        int res = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(') o++;
            else c++;
            if(o<c){
                o = 0;
                c = 0;
                res++;
            }
        }
        if(o>c) res = res + (o-c);
        return res;
    }
}