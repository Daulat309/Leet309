class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1) return s;
        long res = s + m;
        long cur = (n - 2)/2;
        res += (m-1) * cur;
        //if(n>=4) res--;
        return res;
    }
}