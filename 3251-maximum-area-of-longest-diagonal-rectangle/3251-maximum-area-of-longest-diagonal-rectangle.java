class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0, maxDiag = 0;

        for (int[] rect : dimensions) {
            int l = rect[0], w = rect[1];
            int currDiag = l * l + w * w;
            int currArea = l * w;

            if (currDiag > maxDiag || (currDiag == maxDiag && currArea > maxArea)) {
                maxDiag = currDiag;
                maxArea = currArea;
            }
        }
        return maxArea;
    }
}