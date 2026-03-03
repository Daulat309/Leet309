class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        n--;
        while(n-->0){
            s = next(s);
        }
        return s.charAt(k-1);
    }

    public String next(String s){
        StringBuilder sb = new StringBuilder(s);
        int l = sb.length();
        sb.append("1");
        for(int i = l-1;i>=0;i--){
            if(sb.charAt(i)=='1') sb.append('0');
            else sb.append('1');
        }
        return sb.toString();
    }
}