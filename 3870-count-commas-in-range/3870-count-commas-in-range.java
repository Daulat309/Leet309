class Solution {
    public int countCommas(int n) {
        int cnt = 0;
        // if(n>99999){
        //     cnt += n - 100000 + 1;
        // }
        // if(n>9999){
        //     cnt += n - 10000 + 1;
        // }
        // if(n>999){
        //     cnt += n - 1000 + 1;
        // }
        if(n>999) cnt += n - 999;
        return cnt;
    }
}