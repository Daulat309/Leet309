class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] arr1 = new int[2];
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    arr1[0] = i;
                    arr1[1] = j;
                    return arr1;
                } 
            }
        } 
        return arr1;
    }
}