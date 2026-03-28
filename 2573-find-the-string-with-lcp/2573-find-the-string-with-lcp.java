class Solution {

    class DSU {
        int[] parent, rank;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++) parent[i] = i;
        }

        int findPar(int x) {
            if(parent[x] != x)
                parent[x] = findPar(parent[x]);
            return parent[x];
        }

        void unite(int x, int y) {
            int px = findPar(x), py = findPar(y);
            if(px == py) return;

            if(rank[px] < rank[py]) parent[px] = py;
            else if(rank[px] > rank[py]) parent[py] = px;
            else {
                parent[py] = px;
                rank[px]++;
            }
        }
    }

    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        DSU dsu = new DSU(n);

        for(int i = 0; i < n; i++) {
            if(lcp[i][i] != n - i) return "";
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(lcp[i][j] > 0)
                    dsu.unite(i, j);
            }
        }

        for(int i = 0; i < n; i++)
            dsu.parent[i] = dsu.findPar(i);

        char[] grp = new char[n];
        char[] word = new char[n];
        char c = 'a';

        for(int i = 0; i < n; i++) {
            int p = dsu.parent[i];
            if(grp[p] == 0) {
                if(c > 'z') return "";
                grp[p] = c++;
            }
            word[i] = grp[p];
        }

        for(int i = n - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int val;
                if(word[i] == word[j]) {
                    if(i + 1 < n && j + 1 < n)
                        val = 1 + lcp[i + 1][j + 1];
                    else
                        val = 1;
                } else val = 0;

                if(val != lcp[i][j]) return "";
            }
        }

        return new String(word);
    }
}