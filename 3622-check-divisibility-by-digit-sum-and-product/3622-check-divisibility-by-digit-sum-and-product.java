class Solution {
    public boolean checkDivisibility(int n) {
        int mul = 1, sm = 0, k = n;
        while(k>0){
            int d = k % 10;
            mul *= d;
            sm += d;
            k /= 10;
        }
        k = sm + mul;
        return n%k==0;
    }
}