class Pair{
    char ch;
    int cnt;

    Pair(char ch, int cnt){
        this.ch = ch;
        this.cnt = cnt;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st =new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()&&st.peek().ch==ch&&st.peek().cnt==k-1) st.pop();
            else if(!st.isEmpty()&&st.peek().ch==ch){
                int cnt = st.pop().cnt;
                st.push(new Pair(ch,cnt+1));
            }
            else st.push(new Pair(ch,1));
        }
        String str = "";
        while(!st.isEmpty()){
            Pair p = st.pop();
            int n = p.cnt;
            while(n-->0){
                str = p.ch + str;
            }
        }
        return str;
    }
}