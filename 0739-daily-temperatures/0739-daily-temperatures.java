class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] r = new int[t.length];
        Stack<Integer> st2 = new Stack<>();
        for(int i = t.length-1;i>=0;i--){
            while(!st2.isEmpty()&&t[st2.peek()]<=t[i]) st2.pop();
            if(st2.isEmpty()) r[i] = 0;
            else r[i] = st2.peek()-i;
            st2.push(i);
        }
        return r;
    }
}