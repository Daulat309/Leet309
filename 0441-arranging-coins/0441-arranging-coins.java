class Solution {
    public int arrangeCoins(int n) {
        long mn = 0, mx = n;

        while(mn<=mx){
            long md =(long)mn + (mx-mn)/2;
            long req = ((long)md*(md+1))/2;
            if(req<=n) mn = md + 1;
            else mx = md - 1;
        }
        return (int)mx;
    }
}