class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<numbers.length;i++){
            int r = target - numbers[i];
            if(map.containsKey(r)) return new int[]{map.get(r)+1,i+1};
            map.put(numbers[i],i);
        }
        return  new int[]{-1,-1};
    }
}