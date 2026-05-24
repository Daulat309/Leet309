class Solution {
    public int findMaxLength(int[] nums) {
        int on = 0, zr = 0, max = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        map.putIfAbsent(0,new ArrayList<>());
        map.get(0).add(0);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0) zr++;
            else on++;
            int d = zr - on;
            if(d==0) max = Math.max(max,i+1);
            else if(map.containsKey(d)&&d!=0) {
                int ind = map.get(d).get(0);
                max = Math.max(max,i-ind);
            }
            map.putIfAbsent(d,new ArrayList<>());
            map.get(d).add(i);
        }
        return max;
    }
}