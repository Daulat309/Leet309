class Solution {
    public int numSteps(String s) {
        int k = 1;
        long n = 0;
        int cnt = 0;

        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1') n += k;
            k *= 2;
        }

        while(n!=1){
            if(n%2==0) n = n/2;
            else n++;
            cnt++;
        }
        return cnt;
    }
}