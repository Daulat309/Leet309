class Solution {
    public int mySqrt(int x) {
        if(x==1||x==0) return x;
        int l = 2, h = x;
        int ans = 1;
        while(l<=h){
            int m = l+(h-l)/2;
            if((long)m*m<=x){
                ans = m;
                l = m+1;
            }
            else h = m-1;
        }
        return ans;
    }
}