class Solution {
    public int countElements(int[] arr) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for(int i : arr){
            if(mx<i) mx = i;
            if(mn>i) mn = i;
        }
        int cnt = 0;
        for(int i : arr) if(i!=mx&&i!=mn) cnt++;
        return cnt;
    }
}