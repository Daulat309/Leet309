class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i = 0;i<ans.length;i++){
            int n = nums.get(i);
            boolean isit = true;
            for(int j = 1;j<n;j++){
                int res = j | (j+1);
                if( res == n){
                    ans[i] = j;
                    isit = false;
                    break;
                }
            }
            if (isit) ans[i] = -1;
        }
        return ans;
    }
}