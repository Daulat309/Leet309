class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int l = 0;
        while(l<s.length()){
            char c = s.charAt(l);
            if(c=='['){
                st.push(']');
            }
            else if(c=='{'){
                st.push('}');
            }
            else if(c=='('){
                st.push(')');
            }
            else if(st.isEmpty()||st.peek()!=c) return false;
            else st.pop();
            l++;
        }
        return st.isEmpty();
    }
}