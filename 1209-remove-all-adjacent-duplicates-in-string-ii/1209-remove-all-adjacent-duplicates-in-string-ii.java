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
                    while(!st.isEmpty()&&st.peek().ch==c){
                        st.pop();
                        //if(!st.isEmpty()) p = st.peek();
                    }
                }
                else{
                    st.push(new Pair(c,p.num+1));
                }
            }
            else{
                st.push(new Pair(c,1));
            }
        }
        StringBuilder sb = new StringBuilder();
        int l = st.size();
        for(int i = 0;i<l;i++) sb.append(st.pop().ch);
        return sb.reverse().toString();
    }
}