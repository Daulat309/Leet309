class Solution {
    public char processStr(String s, long k) {
        long l = 0;
        for (char c : s.toCharArray()) {
            if (c == '*') {
                l = Math.max(0, l - 1);
            } else if (c == '#') {
                l = l*2;
            } else if (c == '%') {
                continue;
            } else {
                l += 1;
            }
        }

        if (k >= l) return '.';

        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (c == '*') {
                l += 1;
            } else if (c == '#') {
                l /= 2;
                if (k >= l) k -= l;
            } else if (c == '%') {
                k = l - 1 - k;
            } else {
                l -= 1;
                if (l == k) return c;
            }
        }

        return '.';
    }
}