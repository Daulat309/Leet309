class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        for(int i = 0;i<a.length;i++){
            if(a[i]>mass) return false;
            mass += a[i];
            if(mass>100000) mass = 100000;
        }
        return true;
    }
}