class Solution {
    public int findMaxLength(int[] nums) {
        int on = 0, zr = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0) zr++;
            else on++;
            int d = zr - on;
            if(map.containsKey(d)) {
                max = Math.max(max,i-map.get(d));
            }
            else map.put(d,i);
        }
        return max;
    }
}