class Pair{
    char ch;
    int num;

    Pair(char ch, int num){
        this.ch = ch;
        this.num = num;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            Pair p = null;
            if(!st.isEmpty()) p = st.peek();
            if(!st.isEmpty()&&p.ch==c){
                if(p.num==k-1){
                    //while(!st.isEmpty()&&st.peek().ch==c){
                        st.pop();
                    //}
                }
                else{
                    st.peek().num++;
                }
            }
            else{
                st.push(new Pair(c,1));
            }
        }
        StringBuilder sb = new StringBuilder();
        //int l = st.size();
        while(!st.isEmpty()){
            while(st.peek().num>0){
                sb.append(st.peek().ch);
                st.peek().num--;
            }
            st.pop();
        }
        return sb.reverse().toString();
    }
}