class Solution {
    public List<Integer> solveQueries(int[] n, int[] q) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0;j<q.length;j++){
            int s = q[j];
            int t = n[s];
            boolean found = true;
            for(int i = 1;i<(n.length)/2+1;i++){
                if(n[(s+i)%n.length]==t){
                    list.add(i);
                    found = false;
                    break;
                }
                if(n[(n.length+s-i)%n.length]==t){
                    list.add(i);
                    found = false;
                    break;
                }
            }
            if(found){
                System.out.println(-1);
                list.add(-1);
            }
        }
        return list;
    }
}