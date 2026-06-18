class Solution {
    public int minEatingSpeed(int[] piles, int hr) {
        Arrays.sort(piles);
        int l = 1, h = piles[piles.length-1];
        int rs = 0;
        while(l<=h){
            int m = l + (h-l)/2;
            long r = 0;
            for(int i = 0;i<piles.length;i++){
                r += piles[i]/m;
                if(piles[i]%m!=0) r++;
            }
            if(r<=hr){
                rs = m;
                h = m - 1;
            }
            else l = m + 1;
        }
        return rs;
    }
}