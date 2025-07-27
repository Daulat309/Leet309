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
        char[] arr1 = new char[arr.length];
        int h = 0;
        int v = 0;
        int prev = 0;
        int next = 0;
        int count = 0;
        arr1[0] = arr1[arr.length-1] = 'N';
        for(int i = 1;i<arr.length-1;i++){
            prev = arr[i-1];
            if(prev == arr[i]){
                prev = l(arr,i,arr[i]);
            }
            next = arr[i+1];
            if(next==arr[i]){
                next = r(arr,i,arr[i]);
            }
            if(arr[i]<prev&&arr[i]<next&&(arr[i]!=arr[i-1])){
                arr1[i] = 'V';
                count++;
                // System.out.println(i);
                // System.out.println(arr1[i]);
                // System.out.println(prev);
                // System.out.println(arr[i]);
                // System.out.println(next);
            }
            if(arr[i]>prev&&arr[i]>next&&(arr[i]!=arr[i-1])){
                arr1[i] = 'H';
                count++;
                // System.out.println(i);
                // System.out.println(arr1[i]);
            }
        }
        return count;
    }
}