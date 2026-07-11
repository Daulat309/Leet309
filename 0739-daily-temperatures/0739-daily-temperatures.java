class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int[] a = new int[t.length];
        for(int i = t.length-1;i>=0;i--){
            while(!st.isEmpty()&&t[st.peek()]<=t[i]) st.pop();
            if(!st.isEmpty()) a[i] = st.peek() - i;
            else a[i] = 0;
            st.push(i);
        }
        return a;
    }
}