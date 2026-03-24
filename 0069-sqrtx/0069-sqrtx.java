class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int a = (int) sqrt(x);
        return a;
    }

    public double sqrt(double x){
        double l = Math.min(1,x);
        double h = Math.max(1,x);
        while(100*l*l<x) l *= 10;
        while(0.01*h*h>x) h *= 0.1;
        double m = 1;
        for(int i = 0;i<100;i++){
            m = l + (h-l)/2;
            if(m*m==x) return m;
            if(m*m>x) h = m-1;
            else l = m + 1;
        }
        return m;
    }
}