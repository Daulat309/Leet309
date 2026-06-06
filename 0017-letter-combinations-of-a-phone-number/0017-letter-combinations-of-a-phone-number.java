class Solution {
    public List<String> letterCombinations(String d) {
        String[] s = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        call(d,s,0,sb,list);
        return list;
    }


    public void call(String o,String[] d, int idx, StringBuilder sb,List<String> list){
        if(idx==o.length()){
            list.add(sb.toString());
            return;
        }

        String s = d[o.charAt(idx)-'0'];

        for(int i = 0;i<s.length();i++){
            sb.append(s.charAt(i));
            call(o,d,idx+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}