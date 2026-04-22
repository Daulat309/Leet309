class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        int sl = n;
        int ft = n;
        do{
            sl = sqValue(sl);
            ft = sqValue(sqValue(ft));
        }while(sl!=ft);

        return sl==1;
    }

    public int sqValue(int n){
        int sum = 0;
        while(n>0){
            sum += Math.pow(n%10,2);
            n /= 10;
        }
        return sum;
    }
}