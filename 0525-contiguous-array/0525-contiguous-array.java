class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int o = 0;
        int z = 0;
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1) o++;
            else z++;
            int d = z - o;
            if(d==0) res = Math.max(i + 1, res);
            if(map.containsKey(d)) res = Math.max(i - map.get(d), res);
            map.putIfAbsent(d,i);
        }
        return res;
    }
}