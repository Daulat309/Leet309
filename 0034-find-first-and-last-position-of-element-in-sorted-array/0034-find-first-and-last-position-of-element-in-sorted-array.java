class Solution {
    public int[] searchRange(int[] ar, int x) {
        int[] a = new int[2];
        a[0] = lb(ar,0,ar.length-1,x);
        if(a[0]!=-1) a[0]= ar[a[0]]==x?a[0]:-1;
        a[1] = a[0]==-1?-1:ub(ar,0,ar.length-1,x,ar.length) - 1;
        return a;
    }

    public int ub(int[] a, int l, int h, int x,int ub){
        if(l>h) return ub;
        int m = l + (h-l)/2;
        if(a[m]>x){
            ub = m;
            return ub(a, l, m-1, x, ub);
        }
        return ub(a, m+1, h, x, ub);
    }

    public int lb(int[] a, int l, int h, int x){
        if(l>h) return l==a.length?-1:l;
        int m = l + (h-l)/2;
        if(a[m]>=x){
            return lb(a, l, m-1, x);
        }
        return lb(a, m+1, h, x);
    }
}