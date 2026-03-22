class Solution {
    public int countCommas(int n) {
        String s = String.valueOf(n);
        return ((n-1000+1)*(s.length()/4));
    }
}