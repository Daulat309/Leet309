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
                n *= sn;
                r += n;
                n = 0;
                sn = 1;
                if(!st.isEmpty()){
                    sn = st.pop();
                    r *= sn;
                    r += st.pop();
                    sn = 1;
                }
            }
            else if(c=='+'||c=='-'){
                n *= sn;
                System.out.println("Before r : "+r);
                r += n;
                System.out.println("After r : "+r);
                n = 0;
                sn = c=='+'?1:-1;
            }
            else{
                int d = c - '0';
                System.out.println("First n : "+n+" Digit : "+d);
                n = n*10 + d;
                System.out.println("After n : "+n);
            }
        }
        if(n!=0) {
                n *= sn;
                System.out.println("Before r : "+r);
                r += n;
                System.out.println("After r : "+r);
                n = 0;
                sn = 1;
        }
        return r;
    }
}