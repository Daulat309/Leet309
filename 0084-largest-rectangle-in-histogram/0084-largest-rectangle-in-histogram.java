class Solution {
    public int largestRectangleArea(int[] ht) {
        int n = ht.length;
        Stack<Integer> st = new Stack<>();
        int mx = 0;
        for(int i = 0;i<=n;i++){
            int cur = i==n?0:ht[i];
            while(!st.isEmpty()&&ht[st.peek()]>cur){
                int h = ht[st.pop()];
                int w;
                if(st.isEmpty()){
                    w = i;
                }
                else{
                    w = i - st.peek() - 1;
                }
                mx = Math.max(mx, h*w);
            }
            st.push(i);
        }
        return mx;
    }
}