class Node{
    Node[] Child;
    boolean eow;

    Node(){
        Child = new Node[26];
        eow = false;
    }

}

class Solution {
    Node root = new Node();
    int[] dx = new int[]{0,1,0,-1};
    int[] dy = new int[]{1,0,-1,0};
    HashSet<String> list = new HashSet<>();
    public List<String> findWords(char[][] grid, String[] words) {
        int m = grid.length, n = grid[0].length;
        for(String s : words){
            insert(s);
        }
        StringBuilder sb = new StringBuilder();
        Node current = root;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                char c = grid[i][j];
                if(current.Child[c-'a']!=null){
                    char temp = (char)grid[i][j];
                    grid[i][j] = '$';
                    sb.append((char)temp);
                    Node t = current;
                    t = current.Child[temp-'a'];
                    if(t.eow) list.add(sb.toString());
                    bfs(i, j, t, grid, sb);
                    sb.deleteCharAt(sb.length()-1);
                    grid[i][j] = (char)temp;
                }
            }
        }
        List<String> ls = new ArrayList<>();
        for(String s : list) ls.add(s);
        return ls;
    }

    public void insert(String s){
        Node current = root;

        for(char c : s.toCharArray()){
            int i = c - 'a';
            if(current.Child[i]==null){
                Node node = new Node();
                current.Child[i] = node;
            }
            current = current.Child[i];
        }
        current.eow = true;
    }

    public void bfs(int i, int j, Node current, char[][] grid, StringBuilder sb){
        for(int k = 0;k<4;k++){
            int ni = i+dx[k];
            int nj = j+dy[k];
            if(ni>=0&&nj>=0&&ni<grid.length&&nj<grid[0].length&&grid[ni][nj]!='$'&&current.Child[grid[ni][nj]-'a']!=null){
                char temp = (char)grid[ni][nj];
                grid[ni][nj] = '$';
                sb.append((char)temp);
                Node t = current;
                t = current.Child[temp-'a'];
                if(t.eow) list.add(sb.toString());
                bfs(ni, nj, t, grid, sb);
                sb.deleteCharAt(sb.length()-1);
                grid[ni][nj] = (char)temp;
            }
        }
        
    }
}