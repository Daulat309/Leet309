class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        System.out.println(list);
        add(n, 0, 0,new StringBuilder(),list);
        return list;
    }

    public void add(int n, int o, int c, StringBuilder sb, List<String> list){
        if(o==n&&c==n){
            list.add(sb.toString());
            return;
        }
        if(o<n){
            sb.append('(');
            add(n, o+1, c,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<o){
            sb.append(')');
            add(n, o, c+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}