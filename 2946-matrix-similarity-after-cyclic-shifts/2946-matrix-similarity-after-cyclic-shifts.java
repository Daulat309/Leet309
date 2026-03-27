class Solution {
    public boolean areSimilar(int[][] a, int k) {
        int odd = 0, even = 0;
        k = k % a[0].length;
        for(int i = 0;i<a.length;i++){
            if((i & 1)!=1){for(int j = 0;j<a[i].length;j++){
                if(j-k<0){
                    if(a[i][j]==a[i][a[0].length-(k-j)]) even++;
                }
                else{
                    if(a[i][j]==a[i][j-k]) even++;
                }
            }
            }
            else for(int j = 0;j<a[0].length;j++){
                if(j+k>a[0].length-1){
                    if(a[i][j]==a[i][k-(a[0].length-1-j)-1]) odd++;
                }
                else{
                    if(a[i][j]==a[i][j+k]) odd++;
                }
            }
        }
        return (a.length/2)*a[0].length==odd&&(a.length/2+a.length%2)*a[0].length==even;
    }
}