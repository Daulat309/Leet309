class Solution {
    public char nextGreatestLetter(char[] ar, char x) {
        int l = 0;
        int h = ar.length-1;
        int ans = -1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(ar[mid]>x){
                ans = mid;
                h = mid - 1;
            }
            else l = mid + 1;
        }
        return ans==-1?ar[0]:ar[ans];
    }
}