class Solution {
    public String decodeCiphertext(String s, int r) {
        if(s.length()==0)return s;
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        int col = s.length()/r;
        int c = 1;
        int i = 0;
        sb.append(getChar(s,0));
        while(cnt!=s.length()){
            i += col + 1;
            if(i>=s.length()){
                i = c;
                c++;
            }
            char ch = getChar(s,i);
            sb.append((char)ch);
            cnt++;
        }
        while(sb.charAt(sb.length() - 1)==' ') sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static char getChar(String s, int i){
        return s.charAt(i);
    }
}