class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(!sb.isEmpty()) sb.deleteCharAt(sb.length()-1);
            }
            else if(s.charAt(i)=='#'){
                if(!sb.isEmpty()) sb.append(sb.toString());
            }
            else if(s.charAt(i)=='%'){
                if(!sb.isEmpty()) sb.reverse();
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}