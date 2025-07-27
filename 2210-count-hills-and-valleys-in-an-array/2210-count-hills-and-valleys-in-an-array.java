class Solution {
    // public int l(int[] arr,int j,int k){
    //     for(int i = j-1;i>=0;i--){
    //         if(arr[i]!=k) return arr[i];
    //     }
    //     return k;
    // }
    // public int r(int[] arr,int j,int k){
    //     for(int i = j+1;i<arr.length;i++){
    //         if(arr[i]!=k) return arr[i];
    //     }
    //     return k;
    // }
    public int countHillValley(int[] arr) {
        int count = 0;
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i] == arr[i-1]) continue;
            int prev = i-1;
            int next = i+1;
            while(prev >= 0 && arr[i] == arr[prev]) {
                prev--;
            }
            while(next < arr.length && arr[i] == arr[next]) {
                next++;
            }
            if(prev >= 0 && next < arr.length){
                if((arr[i]<arr[prev]&&arr[i]<arr[next])||(arr[i]>arr[prev]&&arr[i]>arr[next])){
                    count++;
                }
            }
        }
        return count;
    }
}