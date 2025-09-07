class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n==1) return arr;
        if(n%2==0){
            int k = 1;
            for(int i = 0;i<n;i += 2){
                arr[i] = k;
                arr[i+1] = k*(-1);
                k++;
            }
            return arr;
        }
        else{
            if(n==3){
                arr[0] = -1;
                arr[1] = -2;
                arr[2] = 3;
                return arr;
            }
            else{
                int k = 4;
                arr[0] = -1;
                arr[1] = -2;
                arr[2] = 3;
                for(int i = 3;i<n;i += 2){
                arr[i] = k;
                arr[i+1] = k*(-1);
                k++;
                }
                return arr;
            }
        }
    }
}