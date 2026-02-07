class Solution {
    public int countMonobit(int n) {
        if(n==0) return 1;
        int[] ar = {1,3,7,15,31,63,127,255,511};
        for(int i = 1;i<9;i++){
            if(ar[i]>n) return i+1;
        }
        return 10;
    }
}