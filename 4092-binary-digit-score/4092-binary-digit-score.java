class Solution {
    public int calculateScore(int a, int b) {
        int ac = 0, bc = 0;
        while(a>0){
            ac++;
            a = a & (a-1);
        }
        while(b>0){
            bc++;
            b = b & (b-1);
        }
        return ac>=bc?ac*bc : bc / ac;
    }
}