class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb = new StringBuilder();
        int xx = 0, yy = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==x||s.charAt(i)==y){
                if(s.charAt(i)==x) xx++;
                if(s.charAt(i)==y) yy++;
            }
            else sb.append(s.charAt(i));
        }
        String str = "";
        for(int i = 0;i<yy;i++) str +=y;
        sb.insert(0,str);
        for(int i = 0;i<xx;i++) sb.append(x);
        return sb.toString();
    }
}