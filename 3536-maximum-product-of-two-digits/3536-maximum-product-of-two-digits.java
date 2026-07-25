class Solution {
    public int maxProduct(int n) {
        int m1 = 0, m2 = 0;
        while(n!=0){
            int d = n%10;
            if(d>m1){
                m2 = m1;
                m1 = d;
            }
            else m2 =Math.max(m2,d);
            n /= 10;
        }
        return m1*m2;
    }
}