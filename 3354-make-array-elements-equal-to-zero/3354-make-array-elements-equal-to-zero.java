class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int nZ = 0;
        int count = 0;
        for(int x : nums) if(x>0) nZ++;
        for(int i = 0;i<n;i++){
            if(nums[i]==0){
                if(isValid(nums,nZ,i,-1)) count++;
                if(isValid(nums,nZ,i,1)) count++;
            }
        }
        return count;    
    }

    private boolean isValid(int[] a,int nZ,int cur,int dir){
        int n = a.length;
        int[] arr = a.clone();
        while(nZ > 0 && cur>=0 && cur<n){
            if(arr[cur]>0){
                arr[cur]--;
                dir *= -1;
                if(arr[cur]==0) nZ--;
            }
            cur += dir;
        }
        return nZ==0;
    }
}