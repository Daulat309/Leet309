class Solution {
    public int numberOfSteps(int num) {
        return helper(0,num);
    }
    public static int helper(int stp, int num){
        if(num==0) return stp;
        return helper(++stp,(num & 1)==1?(--num):(num/2));
    }
}