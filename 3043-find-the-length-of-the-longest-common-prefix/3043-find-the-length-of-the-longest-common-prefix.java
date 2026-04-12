class Solution {
    public int longestCommonPrefix(int[] a, int[] b) {
        HashSet<String> set = new HashSet<>();
        for(int i : a){
            String s = Integer.toString(i);
            String p = "";
            for(char ch : s.toCharArray()){
                p += ch;
                set.add(p);
            }
        }
        int ml = 0;
        for(int i : b){
            String s = Integer.toString(i);
            String p = "";
            for(char ch : s.toCharArray()){
                p += ch;
                if(set.contains(p)) ml = Math.max(ml,p.length());
            }
        }
        return ml;
    }
}





// class Node{
//     Node[] child;
//     int cpa;
//     int cpb;

//     public Node(){
//         child = new Node[10];
//         cpa = 0;
//         cpb = 0;
//     }
// }

// class Solution {
//     Node root;

//     public Solution(){
//         root = new Node();
//     }

//     public int longestCommonPrefix(int[] a, int[] b) {
//         Solution obj = new Solution();
//         for(int i : a)inserta(Integer.toString(i));
//         for(int i : b)insertb(Integer.toString(i));
//     }

//     public void inserta(String w){
//         Node current = root;
//         for(char ch : w.toCharArray()){
//             int idx = ch - '0';
//             if(current.child[idx]==null){
//                 Node node = new Node();
//                 current.child[idx] = node;
//             }
//             current = current.child[idx];
//             current.cpa++;
//         }
//     }

//     public void insertb(String w){
//         Node current = root;
//         for(char ch : w.toCharArray()){
//             int idx = ch - '0';
//             if(current.child[idx]==null){
//                 Node node = new Node();
//                 current.child[idx] = node;
//             }
//             current = current.child[idx];
//             current.cpb++;
//         }
//     }
// }