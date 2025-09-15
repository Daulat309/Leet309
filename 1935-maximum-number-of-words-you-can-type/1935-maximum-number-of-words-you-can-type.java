class Solution {
    public int canBeTypedWords(String text, String bL) {
        boolean[] broken = new boolean[123];
        for (char c : bL.toCharArray()) {
            broken[c] = true;
        }

        int count = 0;
        boolean brokenFound = false;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                if (!brokenFound) count++;
                brokenFound = false;
            } else if (broken[text.charAt(i)]) {
                brokenFound = true;
            }
        }
        return count;
    }
}
