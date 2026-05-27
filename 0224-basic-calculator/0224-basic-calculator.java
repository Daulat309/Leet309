class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int n = 0, sn = 1, r = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' ') continue;
            if(c=='('){
                st.push(r);
                r = 0;
                st.push(sn);
                sn = 1;
            }
            else if(c==')'){
                r += n*sn;
                n = 0;
                sn = 1;
                if(!st.isEmpty()){
                    r *= st.pop();
                    r += st.pop();
                    sn = 1;
                }
            }
            else if(c=='+'||c=='-'){
                r += n*sn;
                n = 0;
                sn = c=='+'?1:-1;
            }
            else{
                n = n*10 + c - '0';
            }
        }
        return r + sn*n;
    }
}