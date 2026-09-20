class Solution {
    ArrayList<Integer> res = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] m) {
        int x = 0, y = 0, dx = 0, dy = 1, r = m.length, c = m[0].length;


        for(int i = 0;i<r*c;i++){
            res.add(m[x][y]);
            m[x][y] = -101;

            if(!(0<=x+dx&&0<=y+dy&&y+dy<c&&x+dx<r)||m[x+dx][y+dy]==-101){
                int temp = dy;
                dy = -dx;
                dx = temp;
            }

            x += dx;
            y += dy;
        }

        return res;
    }
}