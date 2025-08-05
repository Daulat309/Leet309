class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i = 0;i<fruits.length;i++){
            inner:for(int j = 0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    break inner;
                }
                if(j==baskets.length-1){
                    count++;
                }    
            }
        }
        return count;
    }
}