class Solution {
    public int subarraySum(int[] nums, int k) {
        int s = 0, cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0;i<nums.length;i++){
            s += nums[i];
            int m = s - k;
            int f = map.getOrDefault(m,0);
            cnt += f;
            map.put(s,map.getOrDefault(s, 0)+1);
        }
        return cnt;
    }
}



/*
here m is which part we can delete from current frame of s

*/