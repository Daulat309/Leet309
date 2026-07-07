class Solution {
    public int subarraySum(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        int s = 0;
        for(int i = 0;i<a.length;i++){
            s += a[i];
            int f = map.getOrDefault(s-k,0);
            res += f;
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return res;
    }
}