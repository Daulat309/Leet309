class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        list.clear();
        System.out.println(Arrays.toString(nums));
        for(int i = 0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int f = i;
            int x = 0 - nums[f];
            int s = i+1, t = nums.length-1;
            check(nums,x,f,s,t);
        }
        return list;
    }

    public void check(int[] a, int x,int f, int l, int h){
        while(l<h){
            if(a[l]+a[h]==x){
                list.add(Arrays.asList(a[f],a[l],a[h]));
                l++;
                h--;
                while(l<h&&a[l]==a[l-1])l++;
                while(l<h&&a[h]==a[h+1])h--;
            }
            else{
                if((a[l]+a[h])>x) h--;
                else l++;
            }
        }
    }
}