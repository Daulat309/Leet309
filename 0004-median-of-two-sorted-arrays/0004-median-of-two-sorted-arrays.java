class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        int i = 0;
        for(int x:nums1){
            result[i++] = x;
        }
        for(int x:nums2){
            result[i++] = x;
        }
        Arrays.sort(result);
        if(result.length%2==0){
            return (result[result.length/2]+result[result.length/2-1])/2.0;
        }
        else
        return result[result.length/2]/1.0;
    }
}