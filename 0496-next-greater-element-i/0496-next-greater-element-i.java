class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            int j = index(nums2, nums1[i]);
            a[i] = nextg(nums2, j);
        }
        return a;
    }

    public int index(int[] a, int k){
        for(int i = 0;i<a.length;i++){
            if(a[i]==k) return i;
        }
        return 0;
    }

    public int nextg(int[] a, int j){
        int mx = a[j];
        for(j = j+1;j<a.length;j++){
            if(a[j]>mx) return a[j];
        }
        return -1;
    }
}