class Solution {
    public int[] sortedSquares(int[] nums) {
        int vally = nums.length;
        int[] a = new int[nums.length];
        for(int i = 1;i<nums.length;i++){
            if(Math.abs(nums[i-1])<Math.abs(nums[i])){
                vally = i-1;
                break;
            }
        }
        int l = vally - 1, h = vally;
        int i = 0;
        while(l>=0&&h<a.length){
            if(Math.abs(nums[l])>Math.abs(nums[h])){
                a[i] = nums[h]*nums[h];
                h++;
            }
            else{
                a[i] = nums[l]*nums[l];
                l--;
            }
            i++;
        }

        while(h<a.length){
            
                a[i] = nums[h]*nums[h];
                h++;
            
            i++;
        }

        while(l>=0){
            
                a[i] = nums[l]*nums[l];
                l--;
                i++;
        }
        return a;
    }
}