class Solution {
    public int[] nextGreaterElements(int[] n) {
        Stack<Integer> st = new Stack<>();
        int[] r = new int[n.length];
        for(int i : n) st.push(i);
        for(int i = 0;i<n.length;i++){
            int j = (i + 1)%n.length;
            System.out.println(i+"  "+j);
            while(j!=i){
                if(st.get(j)>n[i]){
                    r[i]=st.get(j);
                    break;
                }
                j = (j+1)%n.length;
            }
            if(j==i) r[i] = -1;
        }
        return r;
    }
}