class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int s = 0, t = 0;
        int x = source[0], y = source[1];
        int a = target[0], b = target[1];
        if((x+y)%2==0) s = 0;
        else s = 1;
        if((a+b)%2==0) t = 0;
        else t = 1;
        if(s!=t) return -1;
        if(x==a&&y==b) return 0;
        if(Math.abs(x-a)==Math.abs(y-b)) return 1;
        return 2;
    }
}