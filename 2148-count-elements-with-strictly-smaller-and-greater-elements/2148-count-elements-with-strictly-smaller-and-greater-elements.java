class Solution {
    public int countElements(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]==arr[arr.length-1]) return 0;
        int k = arr.length-1;
        int l = 0;
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                k =  i;
                break;
            }
        }
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=arr[0]){
                l =  i;
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(k+" "+l);
        return k-l+1;
    }
}