class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int odd = 0;
        for(int i = 0;i<nums1.length;i++) if((nums1[i] & 1)==1) odd++;
        if((nums1[0]&1)==1||(odd==0)||nums1.length==odd) return true;
        return false;
    }
}