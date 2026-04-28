class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        char c = (char)(x + '0');
        String S = String.valueOf(x);
        return s.charAt(0)!=c && s.contains(S);
    }
}