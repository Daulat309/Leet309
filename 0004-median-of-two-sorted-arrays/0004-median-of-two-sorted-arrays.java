class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int m = a.length, n = b.length, l = m + n;
        int md = l/2;
        if(m==0){
            if(l==1) return (double)b[0];
            if((l&1)!=1){
                return ((double)b[md]+(double)b[md-1])/2.0;
            }
            return (double)b[md];
        }
        if(n==0){
            if(l==1) return (double)a[0];
            if((l&1)!=1){
                return ((double)a[md]+(double)a[md-1])/2.0;
            }
            return (double)a[md];
        }
        int x = 0, y = n;
        while(x+y>md){
            y--;
        }
        while(x+y<md){
            x++;
        }
        
        

        int fmm = Integer.MIN_VALUE;
        int smn = Integer.MAX_VALUE;

        if(x != 0) fmm = Math.max(fmm, a[x - 1]);
        if(y != 0) fmm = Math.max(fmm, b[y - 1]);

        if(x != m) smn = Math.min(smn, a[x]);
        if(y != n) smn = Math.min(smn, b[y]);
        
        
        while(fmm > smn){ 
            x++; 
            y--; 

            fmm = Integer.MIN_VALUE;
            smn = Integer.MAX_VALUE;

            if(x != 0) fmm = Math.max(fmm, a[x - 1]);
            if(y != 0) fmm = Math.max(fmm, b[y - 1]);

            if(x != m) smn = Math.min(smn, a[x]);
            if(y != n) smn = Math.min(smn, b[y]);
        }
        System.out.println(x + "  " + y +"  "+fmm +"  "+smn);
        if((l&1)==0){
            double res = ((double)fmm+(double)smn)/2.0;
            return res;
        }
        else{
            return (double)smn;
        }
    }
}