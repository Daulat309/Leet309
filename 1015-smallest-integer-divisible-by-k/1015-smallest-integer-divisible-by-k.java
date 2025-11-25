class Solution {
    public int smallestRepunitDivByK(int n) {
        if (n % 2 == 0 || n % 5 == 0) return -1;
        int rem = 1 % n;
        int count = 1;
        boolean[] seen = new boolean[n];
        seen[rem] = true;
        while (rem != 0) {
            rem = (rem * 10 + 1) % n;
            count++;
            if (seen[rem]) return -1;
            seen[rem] = true;
        }
        return count;
    }
}