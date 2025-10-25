class Solution {
    public int addDigits(int num) {
        String s = String.valueOf(num);
        int sum = 0;
        System.out.println(s);
        for(int i = 0;i<s.length();i++){
            System.out.println(s.charAt(i)-'0');
            sum += s.charAt(i)-'0';
        }
        if(sum/10!=0) return addDigits(sum);
        return sum;
    }
}