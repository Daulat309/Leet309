import java.util.*;

class Solution {
    static final long MOD = 1000000007L;
    int[] nums;
    long[] fact, invFact;
    Map<Long, Long> dp;
    int n;

    long modPow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }

    void precomputeFact(int upTo) {
        fact = new long[upTo + 1];
        invFact = new long[upTo + 1];
        fact[0] = 1;
        for (int i = 1; i <= upTo; i++) fact[i] = (fact[i - 1] * i) % MOD;
        invFact[upTo] = modPow(fact[upTo], MOD - 2);
        for (int i = upTo - 1; i >= 0; i--) invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
    }

    long f(int mask, int m, int k, int depth) {
        if (m == 0) return (Integer.bitCount(mask) == k) ? 1 : 0;
        if (depth == n) return 0;
        long key = (((((long) mask << 15) | (m & 0x7FFF)) << 15) | (k & 0x7FFF)) << 6 | (depth & 63);
        if (dp.containsKey(key)) return dp.get(key);

        long res = f(mask >> 1, m, k - (mask & 1), depth + 1);
        long base = fact[m];
        for (int c = 1; c <= m; c++) {
            int nmask = mask + c;
            long sp = f(nmask >> 1, m - c, k - (nmask & 1), depth + 1);
            long term = base * invFact[m - c] % MOD * modPow(nums[depth], c) % MOD * sp % MOD * invFact[c] % MOD;
            res = (res + term) % MOD;
        }
        dp.put(key, res);
        return res;
    }

    public int magicalSum(int m, int k, int[] nums) {
        this.nums = nums;
        this.n = nums.length;
        dp = new HashMap<>();
        precomputeFact(m);
        return (int) f(0, m, k, 0);
    }
}