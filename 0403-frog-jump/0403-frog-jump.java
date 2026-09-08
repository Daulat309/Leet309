class Solution { 
    int[][] dp; 
    HashMap<Integer, Integer> mp = new HashMap<>(); 
    int n; 

    public boolean canCross(int[] s) { 
        n = s.length; 
        dp = new int[n][n]; 

        for(int i = 0; i < n; i++) {
            mp.put(s[i], i); 
        }

        return check(0, 0, s); 
    } 
 
    public boolean check(int i, int p, int[] s) { 
        if(i == n - 1) return true; 

        if(dp[i][p] != 0) {
            return dp[i][p] == 1; 
        }

        for(int k = p - 1; k <= p + 1; k++) { 
            if(k > 0) { 
                int nxt = s[i] + k; 

                if(mp.containsKey(nxt)) { 
                    int next = mp.get(nxt);

                    if(check(next, k, s)) { 
                        dp[i][p] = 1;
                        return true;
                    }
                } 
            } 
        } 

        dp[i][p] = -1;
        return false;
    } 
}