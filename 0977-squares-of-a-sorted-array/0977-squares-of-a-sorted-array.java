class Solution {
    public int[] sortedSquares(int[] a) {
        int s = 0;
        for(int i = 0;i<a.length-1;i++){
            if(Math.abs(a[i])>Math.abs(a[i+1])) s = i+1;
        }
        int e = s-1;
        int[] r = new int[a.length];
        int i = 0;
        while(s<a.length&&e>=0){
            if(Math.abs(a[s])<Math.abs(a[e])){
                r[i] = a[s]*a[s];
                s++;
            }
            else{
                r[i] = a[e]*a[e];
                e--;
            }
            i++;
        }
        while(e>=0){
                r[i] = a[e]*a[e];
                e--;
                i++;
        }
        while(s<a.length){
                r[i] = a[s]*a[s];
                s++;
                i++;
        }
        return r;
    }
}