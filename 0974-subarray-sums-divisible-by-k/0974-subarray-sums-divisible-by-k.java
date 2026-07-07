class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0;
        int res = 0;
        map.put(0,1);
        for(int i = 0;i<nums.length;i++){
            s += nums[i];
            int rem = s % k;
            if(rem<0) rem += k;
            res += map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return res;
    }
}