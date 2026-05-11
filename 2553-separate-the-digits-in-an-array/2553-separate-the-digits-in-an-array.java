class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            addInList(nums[i],list);
        }
        int[] a = new int[list.size()];
        for(int i = 0;i<a.length;i++) a[i] = list.get(i);
        return a;
    }
    public void addInList(int k, ArrayList<Integer> list){
        if(k==0){
            return;
        }
        int d = k%10;
        k /= 10;
        addInList(k,list);
        list.add(d);
    }
}