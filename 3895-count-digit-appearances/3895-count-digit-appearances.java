class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt = 0;
        for(int i : nums){
            while(i>0){
                if(i%10==digit)cnt++;
                i /= 10;
            }
        }
        return cnt;
    }
}