class Solution {
    public int[] twoSum(int[] n, int x) {
        int l = 0, h = n.length-1;
        while(l<h){
            int s = n[l]+n[h];
            if(s==x) return new int[]{l+1,h+1};
            if(s<x)l++;
            else h--;
        }
        return new int[]{-1,-1};
    }
}