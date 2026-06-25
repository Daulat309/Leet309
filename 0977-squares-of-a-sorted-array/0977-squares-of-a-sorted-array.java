class Solution {
    public int[] sortedSquares(int[] a) {
        for(int i = 0 ;i<a.length;i++){
            a[i] = a[i]*a[i];
        }
        int s = 0;
        for(int i = 0;i<a.length-1;i++){
            if(a[i]>a[i+1]) s = i+1;
        }
        int e = s-1;
        int[] r = new int[a.length];
        int i = 0;
        while(s<a.length&&e>=0){
            if(a[s]<a[e]){
                r[i] = a[s];
                s++;
            }
            else{
                r[i] = a[e];
                e--;
            }
            i++;
        }
        while(e>=0){
                r[i] = a[e];
                e--;
                i++;
        }
        while(s<a.length){
                r[i] = a[s];
                s++;
                i++;
        }
        return r;
    }
}