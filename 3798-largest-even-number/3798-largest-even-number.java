class Solution {
    public String largestEven(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'||s.charAt(i)=='2'||s.charAt(i)=='4'||s.charAt(i)=='6'||s.charAt(i)=='8') break;
            sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}