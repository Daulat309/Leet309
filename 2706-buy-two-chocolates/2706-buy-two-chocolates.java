class Solution {
    public int buyChoco(int[] p, int money) {
        Arrays.sort(p);
        for(int i = 0;i<p.length;i++){
            for(int j = i+1;j<p.length&&p[i]+p[j]<=money;j++){
                if(p[i]+p[j]<=money) return money-p[i]-p[j];
            }
        }
        return money;
    }
}