class Solution {
    public int digitFrequencyScore(int n) {
        int[] a = new int[10];
        int sm = 0;
        while(n>0){
            int d = n%10;
            a[d]++;
            sm += d*a[d];
            sm -= d*(a[d]-1);
            n /= 10;
        }
        return sm;
    }
}