class Solution {
    public int totalFruit(int[] fr) {
        int f = fr[0], s = -1;
        int l = 0, h = 1;
        int cc = 1, mxc = 1;

        int lastCount = 1;

        while (h < fr.length) {
            if (fr[h] == f || fr[h] == s) {
                cc++;
            } else {
                if (s == -1) {
                    s = fr[h];
                    cc++;
                } else {
                    // shrink to last continuous block
                    cc = lastCount + 1;
                    l = h - lastCount;

                    // IMPORTANT FIX:
                    // last continuous fruit becomes one type
                    f = fr[h - 1];
                    s = fr[h];
                }
            }
            
            // update lastCount
            if (fr[h] == fr[h - 1]) {
                lastCount++;
            } else {
                lastCount = 1;
            }

            mxc = Math.max(mxc, cc);
            h++;
        }

        return mxc;
    }
}