class Solution {
    public int numRescueBoats(int[] p, int l) {
        Arrays.sort(p);
        int n = p.length;
        int mn = 1, mx = n;
        int res = n;
        while(mn<=mx){
            int md = mn + (mx-mn)/2;
            if(isp(p,l, md)){
                res = md;
                mx = md - 1;
            }
            else mn = md + 1;
        }
        return mn;
    }


    public boolean isp(int[] a, int x, int y){
        int l = 0, h = a.length-1;
        int cnt = 0;
        while(l<=h){
            if(a[l]+a[h]<=x){
                cnt++;
                l++;
                h--;
            }
            else{
                h--;
                cnt++;
            }
        }
        if(cnt<=y) return true;
        return false;
    }
}