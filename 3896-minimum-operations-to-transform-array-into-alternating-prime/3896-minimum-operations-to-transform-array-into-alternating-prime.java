class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        if(nums.length<2){
            while(!isPrime(nums[0])){
                nums[0]++;
                cnt++;
            }
            return cnt;
        }
        for(int i = 0;i<nums.length;i += 2){
            if(!isPrime(nums[i])){
                nums[i]++;
                cnt++;
                i -= 2;
            }
        }
        for(int i = 1;i<nums.length;i += 2){
            if(isPrime(nums[i])){
                nums[i]++;
                cnt++;
                i -= 2;
            }
        }
        return cnt;
    }

    public boolean isPrime(int n) {
        if (n <= 3) return n > 1; 
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i <= n / i; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}