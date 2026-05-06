class Solution {
    public boolean isHappy(int n) {
        int sl = n;
        int fs = n;
        do{
            sl = sqr(sl);
            fs = sqr(sqr(fs));
        }while(sl!=fs&&sl!=1);
        return sl==1;
    }

    public int sqr(int n){
        int s = 0;
        while(n>0){
            int d = n % 10;
            s += d*d;
            n /= 10;
        }
        return s;
    }
}