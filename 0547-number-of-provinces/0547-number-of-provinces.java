class Solution {
    public int findCircleNum(int[][] isc) {
        boolean[] vis = new boolean[isc.length];
        int c = 0;
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<isc.length;i++){
            for(int j = 0;j<isc[0].length;j++){
                if(isc[i][j]==1){
                    isc[i][j]=0;
                    if(!vis[j]){
                        vis[i] = true;
                        c++;
                        q.offer(j);
                        while(!q.isEmpty()){
                            int k = q.poll();
                            for(int cl = 0;cl<isc[k].length;cl++){
                                if(isc[k][cl]==1){
                                    if(!vis[cl]){
                                        vis[cl] = true;
                                        q.offer(cl);
                                    }
                                    isc[k][cl] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return c;
    }
}