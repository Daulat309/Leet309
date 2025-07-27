class Solution {
    public int l(int[] arr,int j,int k){
        for(int i = j-1;i>=0;i--){
            if(arr[i]!=k) return arr[i];
        }
        return k;
    }
    public int r(int[] arr,int j,int k){
        for(int i = j+1;i<arr.length;i++){
            if(arr[i]!=k) return arr[i];
        }
        return k;
    }
    public int countHillValley(int[] arr) {
        int count = 0;
        for(int i = 1;i<arr.length-1;i++){
            int prev = arr[i-1];
            if(prev == arr[i]){
                prev = l(arr,i,arr[i]);
            }
            int next = arr[i+1];
            if(next==arr[i]){
                next = r(arr,i,arr[i]);
            }
            if((arr[i]<prev&&arr[i]<next&&(arr[i]!=arr[i-1]))||(arr[i]>prev&&arr[i]>next&&(arr[i]!=arr[i-1]))){
                count++;
            }
        }
        return count;
    }
}