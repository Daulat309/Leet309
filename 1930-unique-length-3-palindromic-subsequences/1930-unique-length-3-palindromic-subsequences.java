class Solution {
    public int countPalindromicSubsequence(String s) {
        int res = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            int i = s.indexOf(c), j = s.lastIndexOf(c);
            if (i != -1 && j > i) {
                HashSet<Character> set = new HashSet<>();
                for (int k = i + 1; k < j; k++) set.add(s.charAt(k));
                res += set.size();
            }
        }
        return res;
    }
}