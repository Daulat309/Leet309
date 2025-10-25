class Solution {
    public int totalMoney(int n) {
        int wks = n / 7, rem = n % 7;
        return 28 * wks + 7 * wks * (wks - 1) / 2 + wks * rem + rem * (rem + 1) / 2;
    }
}