class Solution {
    public int minDays(int[] bD, int m, int k) {
        int mn = 1, mx  = mn, res =-1;
        for(int i : bD){
            mx = Math.max(i,mx);
        }

        while(mn<=mx){
            int d = mn + (mx-mn)/2;
            if(check(bD,d,k,m)){
                res = d;
                mx = d-1;
            }
            else mn = d + 1;
        }
        return res;
    }


    public boolean check(int[] a, int d, int k, int m){
        int cnt = 0, cur = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]<=d){
                cur++;
                if(cur==k){
                    cnt++;
                    cur = 0;
                }
            }
            else{
                cur = 0;
            }
        }
        return cnt>=m;
    }
}