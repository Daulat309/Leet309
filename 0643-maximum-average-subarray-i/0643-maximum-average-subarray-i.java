class Solution {
    public double findMaxAverage(int[] n, int k) {
        int s = 0, l = 0, h = 0;
        double avg = 0.0, mvg = Double.NEGATIVE_INFINITY;;
        while(h!=k-1){
            s += n[h];
            h++;
        }
        while(h<n.length){
            s += n[h];
            avg =(double) s / k;
            mvg = Math.max(avg,mvg);
            s -= n[l];
            l++;
            h++;
        }
        return mvg;
    }
}