class Solution {
    public int longestOnes(int[] s, int k) {
        int l = 0, zero = 0, mxl = 0;

        for (int h = 0; h < s.length; h++) {
            if (s[h] == 0) zero++;

            while (zero > k) {
                if (s[l] == 0) zero--;
                l++;
            }

            mxl = Math.max(mxl, h - l + 1);
        }

        return mxl;
    }
}