class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        int open = 0;
        StringBuilder msb = new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)==']'){
                StringBuilder sb = new StringBuilder();
                while(st.peek()!='['){
                    sb.append(st.pop());
                }
                st.pop();
                open--;
                sb.reverse();
                int k = 0;
                int mul = 1;
                while(!st.isEmpty()&&st.peek()>='0'&&st.peek()<='9'){
                    k = (st.pop()-'0')*mul + k;
                    mul *= 10;
                }
                if(open!=0){
                    while(k-->0){
                        for(int j = 0;j<sb.length();j++){
                            st.push(sb.charAt(j));
                        }
                    }
                    sb.setLength(0);
                }
                else{
                    StringBuilder nsb = new StringBuilder();
                    while(!st.isEmpty()){
                        nsb.append(st.pop());
                    }
                    nsb.reverse();
                    for(int j = 0;j<nsb.length();j++){
                        msb.append(nsb.charAt(j));
                    }
                    while(k-->0){
                        for(int j = 0;j<sb.length();j++){
                            msb.append(sb.charAt(j));
                        }
                    }
                    sb.setLength(0);
                }
                
            }
            else{
                st.push(s.charAt(i));
                if(s.charAt(i)=='[') open++;
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        msb.append(sb.reverse().toString());
        return msb.toString();
    }
}