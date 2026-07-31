class Solution {
    public int findCircleNum(int[][] isc) {
        boolean[] vis = new boolean[isc.length];
        int c = 0;
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<isc.length;i++){            
                    if(!vis[i]){
                        vis[i] = true;
                        c++;
                        q.offer(i);
                        while(!q.isEmpty()){
                            int k = q.poll();
                            for(int j = 0;j<isc[0].length;j++){
                                if(isc[k][j]==1){
                                    if(!vis[j]){
                                        vis[j] = true;
                                        q.offer(j);
                                    }
                                }
                            }
                        }
                    }
        }
        return c;
    }
}