class Solution {
    int[][] dp = new int[101][101];
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()) return false;
        return check(0,0,0, s1,s2,s3);
    }

    public boolean check(int i, int j, int k, String a, String b, String c){
        if(k==c.length()){
            dp[i][j] = 1;
            return true;
        }
        if(dp[i][j]!=0){
            return dp[i][j]==1;
        }
        if(i<a.length()&&j<b.length()&&a.charAt(i)==c.charAt(k)&&b.charAt(j)==c.charAt(k)){
            dp[i+1][j] = check(i+1,j,k+1,a,b,c)?1:-1;
            dp[i][j+1] = check(i,j+1,k+1,a,b,c)?1:-1;
            return dp[i+1][j]==1 || dp[i][j+1]==1;
        }
        else if(i<a.length()&&a.charAt(i)==c.charAt(k)){
            dp[i+1][j] = check(i+1,j,k+1,a,b,c)?1:-1;
            return dp[i+1][j]==1;
        }
        else if(j<b.length()&&b.charAt(j)==c.charAt(k)){
            dp[i][j+1] = check(i,j+1,k+1,a,b,c)?1:-1;
            return dp[i][j+1]==1;
        }

        else{
            dp[i][j] = -1;
            return false;
        }

    }
}