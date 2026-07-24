class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        add(new StringBuilder(), 0,0,n);
        return list;
        
    }

    public void add(StringBuilder sb, int open, int close, int n){
        if(open==n&&open==close){
            list.add(sb.toString());
        }
        if(open<n){
            sb.append('(');
            add(sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            add(sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}