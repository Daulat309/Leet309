class Solution {
    public int mirrorDistance(int n) {
        int o = n, r = 0;
        while(o!=0){
            int d = o%10;
            r = r*10+d;
            o /= 10;
        }
        return Math.abs(n-r);
    }
}