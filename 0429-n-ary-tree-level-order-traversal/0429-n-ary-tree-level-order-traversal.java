/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){
            int l = q.size();
            ArrayList<Integer> ls = new ArrayList<>();
            while(l-->0){
                Node cur = q.poll();
                ls.add(cur.val);
                for(Node child : cur.children){
                    q.offer(child);
                }
            }
            list.add(ls);
        }

        return list;
        
    }
}