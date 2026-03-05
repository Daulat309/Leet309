class Solution {
    public int maximumPopulation(int[][] logs) {
        int max = 0;
        int year = -1;
        for(int i = 1950;i<=2050;i++){
            int cnt = 0;
            for(int j = 0;j<logs.length;j++){
                if(i>=logs[j][0]&&i<logs[j][1]) cnt++;
            }
            if(cnt>max){
                max = cnt;
                year = i;
            }
        }
        return year;
    }
}