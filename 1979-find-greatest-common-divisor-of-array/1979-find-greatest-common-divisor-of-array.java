class Solution {
    public int findGCD(int[] nums) {
        int mx = Arrays.stream(nums).max().getAsInt();
        int mn = Arrays.stream(nums).min().getAsInt();
        int a = mn, b = mx;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}