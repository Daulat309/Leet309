class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long mn = 1,mx = mn;
        for(int i = 0;i<piles.length;i++) mx = Math.max(piles[i],mx);
        while(mn<=mx){
            long m  = mn + (mx-mn)/2;
            if(check(piles, m, h)) mx = m - 1;
            else mn = m + 1;
        }
        return (int)mn;
    }

    public boolean check(int[] p, long m, long h){
        long rh = 0;
        for(int i = 0;i<p.length;i++){
            rh += p[i]/m;
            if(p[i]%m!=0) rh++;
        }
        return rh<=h;
    }
}