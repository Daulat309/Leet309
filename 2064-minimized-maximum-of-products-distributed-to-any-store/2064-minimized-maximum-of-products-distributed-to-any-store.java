class Solution {
    public int minimizedMaximum(int n, int[] q) {
        int l = 0, h = l, res = 0;
        for(int i : q) h = Math.max(i,h);
        //System.out.println(l +"  "+h);
        while(l<=h){
            int m = l + (h-l)/2;
            int cnt = check(q,m);
            if(cnt==n) res = m;
            if(cnt>n||cnt==0) l = m + 1;
            else h = m - 1;
        }
        return l;
    }

    public int check(int[] a, int m){
        int cnt = 0;
        if(m==0) return 0;
        for(int i : a){
            cnt += i / m;
            if(i%m!=0) cnt++;
        }
        //System.out.println(m+"   "+cnt);
        return cnt;
    }
}