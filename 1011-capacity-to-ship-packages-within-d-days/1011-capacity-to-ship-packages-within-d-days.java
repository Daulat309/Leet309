class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = weights[0], h = 0;
        for(int i : weights){
            l = Math.min(l,i);
            h += i;
        }
        int res = h;

        while(l<=h){
            int m = l + (h-l)/2;
            if(isp(weights,m,days)){
                System.out.println("Works "+"  "+m);
                res = m;
                h = m - 1;
            }
            else l = m + 1;
        }
        return res;
    }

    public boolean isp(int[] a, int c, int k){
        int s = 0,cnt = 0;
        for(int i = 0;i<a.length;i++){
            if(s+a[i]>=c){
                cnt++;
                if(s+a[i]==c) s = 0;
                else s = a[i];
                if(s>c) return false;
            }
            else s+= a[i];
        }
        if(s!=0) cnt++;
        System.out.println(c+"  "+cnt+"  "+k);
        return cnt<=k;
    }
}