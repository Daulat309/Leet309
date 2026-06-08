class Solution {
    public List<String> letterCombinations(String d) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        List<String> list = new ArrayList<>();
        insert(d,map,0,d.length(),list,new StringBuilder());
        return list;
    }

    public void insert(String d, HashMap<Integer,String> map, int idx, int n, List<String> list,StringBuilder sb){
        if(idx==n){
            list.add(sb.toString());
            return;
        }

        String s = map.get(d.charAt(idx)-'0');
        for(int i = 0;i<s.length();i++){
            sb.append(s.charAt(i));
            insert(d,map,idx+1,n,list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}