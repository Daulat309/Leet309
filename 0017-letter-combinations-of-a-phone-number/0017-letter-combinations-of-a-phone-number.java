class Solution {
    List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
       String[] c = new String[10];
       c[0] = " ";
       c[1] = "~"  ;
       c[2] = "abc" ;
       c[3] = "def" ;
       c[4] = "ghi" ;
       c[5] = "jkl" ;
       c[6] = "mno" ;
       c[7] = "pqrs" ;
       c[8] = "tuv" ;
       c[9] = "wxyz" ;
       comb(c,new StringBuilder(), 0, digits);
       return list;
    }

    public void comb(String[] s, StringBuilder sb, int idx, String dig){
        if(idx==dig.length()){
            list.add(new String(sb.toString()));
            return;
        }
        int id = dig.charAt(idx) - '0';
        String cur = s[id];

        for(int i = 0;i<cur.length();i++){
            sb.append(cur.charAt(i));
            comb(s,sb,idx+1,dig);
            sb.deleteCharAt(sb.length()-1);
        }
    }

}