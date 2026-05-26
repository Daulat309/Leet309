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
            if(!st.isEmpty()&&st.peek().ch==c){
                if(st.peek().num==k-1) st.pop();
                else st.peek().num++;
            }
            else st.push(new Pair(c,1));
        }
        StringBuilder sb = new StringBuilder();
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