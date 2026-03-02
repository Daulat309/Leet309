class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> found = new HashSet();
        int steps = 0;
        
        int[] arr = new int[n];        
        for(int i=0; i<n; i++){
            int count = 0;
            int j = n-1;
            while(j>=0 && grid[i][j]==0) {
                count++;
                j--;
            }            
            for(int k=n-1; k>=0; k--){
                if(count>=k && !found.contains(k)){ 
                    found.add(k);               
                    arr[i] = n-1-k;
                    break;
                }
            }
        }
        
        if(found.size()!=n) return -1;
        
        return bubblesort(arr);
    }
    private int bubblesort(int[] arr){
        int k=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    k++;
                }
            }
        }
        
        return k;
    }
}