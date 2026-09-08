class Solution {
    int[][] dp;
    HashMap<Integer, Integer> mp = new HashMap<>();
    int n;
    public boolean canCross(int[] s) {
        n = s.length;
        dp = new int[n][n];
        for(int i = 0;i<n;i++) mp.put(s[i],i);
        return check(0,0,0,s);
    }

    public boolean check(int prev, int i, int p, int[] s){
        if(i==n-1) return true;
        boolean res = false;
        if(dp[prev][i]!=0) return dp[prev][i]==1;

        for(int k = p - 1;k<=p+1;k++){
            if(k>0){
                int nxt = s[i]+k;
                if(mp.containsKey(nxt)){
                    if(check(i,mp.get(nxt),k,s)){
                        dp[i][k] = 1;
                        res = true;
                    }
                }
                else dp[i][k] = -1;
            }
        }
        dp[prev][i] = res?1:-1;
        return dp[prev][i]==1;
    }
}