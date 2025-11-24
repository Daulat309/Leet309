class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] freq = new int[101];
        for(int n : nums) freq[n]++;
        int sum = 0;
        int i = 0;
        for(int n : freq){
            if(n!=0){
                if(n%k==0) sum += i*n;
            }
            i++;
        }
        return sum;
    }
}