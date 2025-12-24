class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        for(int i = 1;i<apple.length;i++) apple[0] += apple[i];
        Arrays.sort(capacity);
        for(int i = capacity.length-1;i>=0;i--){
            apple[0] -= capacity[i];
            if(apple[0]<=0) return capacity.length-i;
        }
        return capacity.length;
    }
}