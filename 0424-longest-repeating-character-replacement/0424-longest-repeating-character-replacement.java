class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int l = 0, maxFreq = 0, maxLen = 0;

        for (int h = 0; h < s.length(); h++) {
            char ch = s.charAt(h);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            // track max frequency in current window
            maxFreq = Math.max(maxFreq, freq.get(ch));

            // if replacements needed > k → shrink
            while ((h - l + 1) - maxFreq > k) {
                char left = s.charAt(l++);
                freq.put(left, freq.get(left) - 1);
            }

            maxLen = Math.max(maxLen, h - l + 1);
        }

        return maxLen;
    }
}