class Solution {
    public int countElements(int[] arr) {
        Arrays.sort(arr);
        int mx = arr[arr.length-1];
        int mn = arr[0];
        int cnt = 0;
        for(int i : arr) if(i!=mx&&i!=mn) cnt++;
        return cnt;
    }
}