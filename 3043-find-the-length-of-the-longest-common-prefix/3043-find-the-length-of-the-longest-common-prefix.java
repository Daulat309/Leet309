// class Solution {
//     public int longestCommonPrefix(int[] a, int[] b) {
//         HashSet<String> set = new HashSet<>();
//         for(int i : a){
//             String s = String.valueOf(i);
//             String p = "";
//             for(char ch : s.toCharArray()){
//                 p += ch;
//                 set.add(p);
//             }
//         }
//         int ml = 0;
//         for(int i : b){
//             String s = String.valueOf(i);
//             String p = "";
//             for(char ch : s.toCharArray()){
//                 p += ch;
//                 if(set.contains(p)) ml = Math.max(ml,p.length());
//             }
//         }
//         return ml;
//     }
// }





class Node{
    Node[] child;

    public Node(){
        child = new Node[10];
    }
}

class Solution {
    Node root;

    public Solution(){
        root = new Node();
    }

    public int longestCommonPrefix(int[] a, int[] b) {
        Solution obj = new Solution();
        int ml = 0;
        for(int i : a)inserta(Integer.toString(i));
        for(int i : b) ml = Math.max(ml,search(Integer.toString(i)));
        return ml;
    }

    public void inserta(String w){
        Node current = root;
        for(char ch : w.toCharArray()){
            int idx = ch - '0';
            if(current.child[idx]==null){
                Node node = new Node();
                current.child[idx] = node;
            }
            current = current.child[idx];
        }
    }

    public int search(String w){
        Node current = root;
        int i = 0;
        for(char ch : w.toCharArray()){
            int idx = ch - '0';
            if(current.child[idx]==null) return i;
            current = current.child[idx];
            i++;
        }
        return i;
    }

}