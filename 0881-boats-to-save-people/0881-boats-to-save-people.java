class Solution {
    public int numRescueBoats(int[] a, int x) {
        Arrays.sort(a);
        int n = a.length;
        // int mn = 1, mx = n;
        // while(mn<=mx){
        //     int md = mn + (mx-mn)/2;
        //     if(isp(p,l, md)){
        //         mx = md - 1;
        //     }
        //     else mn = md + 1;
        // }
        // return mn;

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
        return cnt;
    }


    // public boolean isp(int[] a, int x, int y){
        
    //     if(cnt<=y) return true;
    //     return false;
    // }
}