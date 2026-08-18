class Solution {

    public String longestPalindrome(String s) {

        String mx = "";
        int mxlen = 0;

        for (int j = 0; j < s.length(); j++) {

            for (int i = j; i < s.length(); i++) {

                int l = j, h = i;
                int cnt = 0;

                while (l <= h) {

                    if (s.charAt(l) != s.charAt(h))
                        break;

                    cnt++;
                    l++;
                    h--;
                }

                if (l > h) {
                    int len = i - j + 1;

                    if (len > mxlen) {
                        mx = s.substring(j, i + 1);
                        mxlen = len;
                    }
                }
            }
        }

        return mx;
    }
}