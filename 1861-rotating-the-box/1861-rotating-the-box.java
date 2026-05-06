class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int R = box.length;
        int C = box[0].length;
        
        char[][] res = new char[C][R];
        for(char[] row : res) {
            Arrays.fill(row, '.');
        }
        
        for (int r = 0; r < R; r++) {
            int i = C - 1;
            for (int c = C - 1; c >= 0; c--) {
                if (box[r][c] == '#') {
                    res[i][R - r - 1] = '#';
                    i--;
                } else if (box[r][c] == '*') {
                    res[c][R - r - 1] = '*';
                    i = c - 1;
                }
            }
        }
        return res;
    }
}