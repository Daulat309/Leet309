class Node{
    Node[] child = new Node[26];
    boolean eow = false;
}

class Solution {
    Node root = new Node();
    public List<String> twoEditWords(String[] q, String[] d){
        ArrayList<String> list = new ArrayList<>();
        for(String S : d){
            insert(S);
        }
        for(String S : q){
            if(dfs(S,0,0,root)) list.add(S);
        }
        return list;
    }

    public void insert(String q){
        Node current = root;
        for(char c : q.toCharArray()){
            int idx = c-'a';
            if(current.child[idx]==null){
                current.child[idx] = new Node();
            }
            current = current.child[idx];
        }
        current.eow = true;
    }

    public boolean dfs(String s,int idx,int er,Node node){
        if(er>2) return false;
        if(idx==s.length()) return node.eow;
        int c = s.charAt(idx)-'a';
        if(node.child[c]!=null){
                if(dfs(s,idx+1,er,node.child[c])) return true;
        }
        for(int i = 0;i<26;i++){
            if(node.child[i]!=null){
                if(dfs(s,idx+1,er+1,node.child[i])) return true;
            }
        }
        return false;
    }
}