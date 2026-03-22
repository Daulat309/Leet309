class Solution {
    public int countCommas(int n) {
        int digit = 0;
        int k = n;
        while(k>0){
            k /= 10;
            digit++;
        }
        return ((n-1000+1)*(digit/4));
    }
}