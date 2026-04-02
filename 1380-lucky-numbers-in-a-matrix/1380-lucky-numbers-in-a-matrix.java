class Solution {
    public List<Integer> luckyNumbers(int[][] m) {
        HashSet<Integer> rset = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<m.length;i++){
            int mx = 10000000;
            for(int j = 0;j<m[0].length;j++){
                mx = Math.min(mx,m[i][j]);
            }
            rset.add(mx);
        }
        for(int i = 0;i<m[0].length;i++){
            int mn = 0;
            for(int j = 0;j<m.length;j++){
                mn = Math.max(mn,m[j][i]);
            }
            if(rset.contains(mn))list.add(mn);
        }
        return list;
    }
}