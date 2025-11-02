import java.util.*;

class Solution {
    public long maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int nZ = 0;
        int nN = 0;
        int nP = 0;
        long mul = 1;
        int[] P = new int[3];
        int pk = 0;
        int[] N = new int[3];
        int nk = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                nN++;
                if (nk < 3) N[nk++] = nums[i];
            } else if (nums[i] == 0) {
                nZ++;
            } else {
                nP++;
            }
        }

        for (int i = n - 1; i >= 0 && pk < 3; i--) {
            if (nums[i] > 0) P[pk++] = nums[i];
        }

        if (nZ == n) return 0;

        if (nk < 3) N = Arrays.copyOf(N, nk);
        if (pk < 3) P = Arrays.copyOf(P, pk);

        Arrays.sort(P);
        Arrays.sort(N);

        int maxN1 = (N.length >= 1) ? -N[0] : 0;
        int maxN2 = (N.length >= 2) ? -N[Math.min(1, N.length - 1)] : 0;
        int maxP1 = (P.length >= 1) ? P[P.length - 1] : 0;
        int maxP2 = (P.length >= 2) ? P[Math.max(0, P.length - 2)] : 0;

        int[] A = {maxN1, maxN2, maxP1, maxP2};
        Arrays.sort(A);

        mul = (long) A[3] * (long) A[2] * 100000;
        return mul;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProduct(new int[]{44, 8, 16, 66}));
    }
}