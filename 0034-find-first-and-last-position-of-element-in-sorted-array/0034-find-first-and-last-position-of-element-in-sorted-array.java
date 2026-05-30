class Solution {
    public int[] searchRange(int[] a, int x) {
        return new int[] {lb(a,x,0,a.length-1),ub(a,x,0,a.length-1)};
    }

    public int lb(int[] a, int x,int l, int h){
        int r = -1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]<x){
                l = m + 1;
            }
            else{
                r = m;
                h = m-1;
            }
        }
        //System.out.println(r);
        return r==-1?-1:a[r]==x?r:-1;
    }

    public int ub(int[] a, int x, int l, int h){
        int r = -1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(a[m]<=x){
                r = m;
                l = m + 1;
            }
            else{
                h = m-1;
            }
        }
        //System.out.println(r);
        return r==-1?-1:a[r]==x?r:-1;
    }
}