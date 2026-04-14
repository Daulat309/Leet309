class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0, cnt = 0;
        while(i<t.length()&&j<s.length()){
            if(s.charAt(j)==t.charAt(i)){
                i++;
                cnt++;
            }
            j++;
        }
        return Math.max(0,t.length()-cnt);
    }
}