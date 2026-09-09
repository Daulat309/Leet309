class Solution {

    public long countCommas(long n) {

        long cnt = 0;

        if (n > 999) {
            cnt += n - 999;
        }

        if (n > 999999) {
            cnt += n - 999999;
        }

        if (n > 999999999) {
            cnt += n - 999999999;
        }

        if (n > 999999999999L) {
            cnt += n - 999999999999L;
        }

        if (n > 999999999999999L) {
            cnt ++;
        }

        return cnt;
    }
}