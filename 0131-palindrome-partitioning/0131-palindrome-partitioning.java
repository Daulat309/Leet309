class Solution {
    List<List<String>> list = new ArrayList<>();
    List<String> ls = new ArrayList<>();
    public List<List<String>> partition(String s) {
        pos(s,0,0,0);
        return list;
    }

    public void pos(String s,int last, int cur, int c){
        if(cur==s.length()){
            list.add(new ArrayList<>(ls));
            return;
        }
        for(int i = c;i<s.length();i++){
            if(ispal(s, last, i)){
                ls.add(s.substring(last,i+1));
                pos(s,i+1 ,i+1, i+1);
                ls.remove(ls.size()-1);
            }
        }
    }



    public boolean ispal(String s, int st, int e){
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)) return false;
            st++;
            e--;
        }
        return true;
    }
}