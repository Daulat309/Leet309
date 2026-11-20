class Solution {
    public int maxSelectedElements(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        Arrays.sort(nums);
        int res = 0;
        for(int a : nums){
            mp.put(a+1, mp.getOrDefault(a,0)+1);
            mp.put(a, mp.getOrDefault(a-1, 0)+1);
            res = Math.max(res, Math.max(mp.get(a), mp.get(a+1)));
        }
        return res;
    }
}