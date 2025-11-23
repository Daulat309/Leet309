class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int mod = 1_000_000_007;
        
        long[] v = new long[n + 1];
        long[] sm = new long[n + 1];
        int[] cnt = new int[n + 1];
        long[] p = new long[n + 1];
        
        p[0] = 1;
        for(int i = 0; i < n; i++) {
            p[i+1] = (p[i] * 10) % mod;
            int d = s.charAt(i) - '0';
            sm[i+1] = sm[i] + d;
            
            if(d != 0) {
                v[i+1] = (v[i] * 10 + d) % mod;
                cnt[i+1] = cnt[i] + 1;
            } else {
                v[i+1] = v[i];
                cnt[i+1] = cnt[i];
            }
        }
        
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            
            long dSum = sm[r+1] - sm[l];
            int nz = cnt[r+1] - cnt[l];
            
            long num = (v[r+1] - (v[l] * p[nz]) % mod + mod) % mod;
            ans[i] = (int)((num * (dSum % mod)) % mod);
        }
        return ans;
    }
}