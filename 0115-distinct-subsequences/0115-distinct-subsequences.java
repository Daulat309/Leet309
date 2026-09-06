class Solution {
    int cnt = 0;
    int[][] dp;
    public int numDistinct(String s, String t) {
        dp = new int[s.length()][t.length()];
        for(int[] a : dp) Arrays.fill(a, -1);
        return check(0,0,s,t);
    }

    public int check(int i, int j, String s, String t) {
    int m = s.length(), n = t.length();

    if(j == n) return 1;
    if(i == m) return 0;

    if(dp[i][j] != -1) return dp[i][j];

    int ans = 0; 

    if(s.charAt(i) == t.charAt(j)) {
        ans += check(i + 1, j + 1, s, t);
    }
    ans += check(i + 1, j , s, t);

    return dp[i][j] = ans;
    }
}