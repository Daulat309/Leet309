class Solution {
    public boolean checkGoodInteger(int n) {
        int sqs = 0, dgs = 0;
        while(n>0){
            int d = n %10;
            dgs += d;
            sqs += d*d;
            n /= 10;
        }
        return sqs-dgs>=50;
    }
}