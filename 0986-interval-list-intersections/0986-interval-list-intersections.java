class Solution {
    public int[][] intervalIntersection(int[][] first, int[][] sec) {
        int f = 0, s = 0;
        if(first.length==0||sec.length==0) return new int[][]{};
        ArrayList<int[]> list = new ArrayList<>();
        while(f<first.length&&s<sec.length){
            int sm = Math.max(first[f][0], sec[s][0]);
            int em = Math.min(first[f][1], sec[s][1]);
            if(sm<=em) list.add(new int[] {sm,em});
            if(first[f][1]<sec[s][1]) f++;
            else s++;
        }
        int[][] res = new int[list.size()][2];
        for(int i = 0;i<list.size();i++){
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
    }
}