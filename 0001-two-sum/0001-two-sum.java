class Solution {
    public int[] twoSum(int[] nums, int x) {
        int[] a = new int[nums.length];
        int p = -1;
        for(int k : nums) a[++p] = k;
        Arrays.sort(nums);
        p = -1;
        int q = (int)1e8, l = 0, h = nums.length-1;
        while(l<h){
            int s = nums[l]+nums[h];
            if(s==x){
                p = nums[l];
                q = nums[h];
                break;
            }
            if(s>x) h--;
            else l++;
        }
        if(q==(int)1e8) return new int[]{-1,-1};
        int m = -1, n = -1;
        for(int i = 0;i<a.length;i++){
            if(a[i]==p||a[i]==q){
                if(a[i]==p&&m==-1){
                    m = i;
                }
                else if(a[i]==q&&n==-1){
                    n = i;
                }
            }
            if(m!=-1&&n!=-1) return new int[]{m,n};
        }
        return new int[]{-1,-1};
    }

}

// class Solution {
//     public int[] twoSum(int[] nums, int x) {
//         HashMap<Integer, Integer> set = new HashMap<>();
//         for(int i = 0;i<nums.length;i++){
//             if(set.containsKey(x-nums[i])) return new int[]{set.get(x-nums[i]), i};
//             set.put(nums[i], i);
//         }
//         return new int[] {-1,-1};
//     }
// }