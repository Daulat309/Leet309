class Solution {
    public int climbStairs(int n) {
        if(n<3) return n;
        int p1 = 1, p2 = 2, cur = 0;;
        for(int i = 3;i<=n;i++){
            cur = p1 + p2;
            p1 = p2;
            p2 = cur;
        }
        return cur;
    }
}