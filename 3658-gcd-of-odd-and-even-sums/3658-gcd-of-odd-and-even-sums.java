class Solution {
    public int gcdOfOddEvenSums(int n) {
        int ev = 0, od = 0;
        for(int i = 1;i<=2*n;i += 2){
            od += i;
            ev += i + 1;
        }
        System.out.println(ev+"  "+od);
        return gcd(ev,od);
    }

    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}