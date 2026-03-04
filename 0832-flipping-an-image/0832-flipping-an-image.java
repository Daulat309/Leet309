class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] ar : image){
            int l = 0, h = ar.length-1;
            while(l<=h){
                int temp = ar[l];
                ar[l] = ar[h]==1?0:1;
                ar[h] = temp==1?0:1;
                l++;
                h--;
            }
        }
        for(int[] ar : image) System.out.println(Arrays.toString(ar));
        return image;
    }
}