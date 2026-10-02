class Solution {
    List<String> list;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        make(0,0,n,sb);
        return list;
    }

    public void make(int o, int c, int n, StringBuilder sb){
        if(o==n&&c==n){
            list.add(sb.toString());
            return;
        }
        if(o<n){
            sb.append('(');
            make(o+1,c,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<o){
            sb.append(')');
            make(o,c+1,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}