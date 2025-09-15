class Solution {
    public int canBeTypedWords(String text, String bL) {
        int p = text.length();
        int q = bL.length();
        int cnt = 0;
        boolean isit = false;
        boolean[] arr = new boolean[26];
        for(int k = 0;k<q;k++) arr[bL.charAt(k)-'a'] = true;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                if (!isit) cnt++;
                isit = false;
            } else {
                if (arr[c - 'a']) isit = true;
            }
        }
        if (!isit) cnt++;
        return cnt;
    }
}