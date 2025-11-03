class Solution {
    public int minCost(String s, int[] neededTime) {
        int n = s.length();
        int ans = 0;
        int i = 0;

        while (i < n) {
            char ch = s.charAt(i);
            int tSum = 0;
            int maxT = 0;

            while (i < n && s.charAt(i) == ch) {
                tSum += neededTime[i];
                maxT = Math.max(maxT, neededTime[i]);
                i++;
            }

            ans += (tSum - maxT);
        }

        return ans;
    }
}