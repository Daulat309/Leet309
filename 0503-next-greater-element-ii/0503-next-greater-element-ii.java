class Solution {
    public int[] nextGreaterElements(int[] n) {
        Stack<Integer> st = new Stack<>();
        int[] r = new int[n.length];
        for(int i = n.length-2;i>=0;i--){
            st.push(n[i]);
        }
        for(int i = n.length-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=n[i]) st.pop();
            if(st.isEmpty()) r[i] = -1;
            else r[i] = st.peek();
            st.push(n[i]);
        }
        return r;
    }
}