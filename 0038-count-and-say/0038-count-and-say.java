class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for (int k = 1; k < n; k++) {
            String c = "";
            int i = 0;

            while (i < s.length()) {
                char curr = s.charAt(i);
                int cnt = 0;

                while (i < s.length() && s.charAt(i) == curr) {
                    cnt++;
                    i++;
                }

                c += cnt;
                c += curr;
            }

            s = c;
        }

        return s;
    }
}