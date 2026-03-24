class Solution {
    public int[] twoSum(int[] a, int x) {
        for(int i = 0;i<a.length-1;i++){
            int l = i + 1, h = a.length-1;
            while(l<=h){
                int m = l + (h-l)/2;
                if(a[m]+a[i]==x){
                    System.out.println(i+" "+m+" "+a[m]+" "+ (x-a[i]));
                    return new int[]{i+1,m+1};
                }
                if(a[m]+a[i]>x) h = m -1;
                else l = m + 1;
            }
        }
        return new int[]{-1,-1};
    }
}