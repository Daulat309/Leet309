class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int l = 1, h = Arrays.stream(nums).max().getAsInt();
        while(l<=h){
            int md = l + (h-l)/2;
            int sm = get(md, nums);
            if(sm<=t){
                h = md - 1;
            }
            else{
                l = md + 1;
            }
        }
        return l;
    }

    public int get(int k , int[] a){
        int sm = 0;
        for(int i : a){
            if(i%k==0) sm += i/k;
            else{
                sm += i/k + 1;
            }
        }
        return sm;
    }
}