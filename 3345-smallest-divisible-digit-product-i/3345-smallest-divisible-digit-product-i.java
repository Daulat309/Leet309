class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n;;i++){
            if(i%10==0) return i;
            if(prod(i,t)) return i;
        }
    }

    public boolean prod(int k, int t){
        long l = 1;
        while(k>0){
            l *= k%10;
            k /= 10;
        }
        return l%t==0;
    }
}