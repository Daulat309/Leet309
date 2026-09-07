class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()][text2.length()];
        for(int[] a : dp)  Arrays.fill(a,-1);
        return check(0,0,text1,text2);
    }


    public int check(int i, int j,String a, String b){
        if(i==a.length()||j==b.length()){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];

        if(a.charAt(i)==b.charAt(j)){
            dp[i][j] = 1 + check(i+1,j+1, a, b);
        }
        else{
            dp[i][j] = Math.max(check(i,j+1, a, b),check(i+1,j, a, b));
        }
        return dp[i][j];
    }
}