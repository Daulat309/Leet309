class Solution {
    private String createKey(int[] a) {
        return (a[0]+"-"+a[1]);
    }
    
    public int countCoveredBuildings(int n, int[][] arr) {
        Map<String, Integer> map = new HashMap<>();
        int len = arr.length;
        for(int i=0; i<len; i++) {
            String key = createKey(arr[i]);
            map.put(key, i);
        }
        
        Arrays.sort(arr, (int[] a,int[] b)->{
            if(a[0] == b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        boolean row[] = new boolean[len];
        for(int i=1; i<len-1; i++) {
            if(arr[i-1][0] == arr[i][0] && arr[i][0] == arr[i+1][0]) {
                String key = createKey(arr[i]);
                row[map.get(key)] = true;
            }
        }
        
        Arrays.sort(arr, (int[] a,int[] b)->{
            if(a[1] == b[1]) return a[0]-b[0];
            return a[1]-b[1];
        });
        boolean col[] = new boolean[len];
        for(int i=1; i<len-1; i++) {
            if(arr[i-1][1] == arr[i][1] && arr[i][1] == arr[i+1][1]) {
                String key = createKey(arr[i]);
                col[map.get(key)] = true;
            }
        }
        
        int ct = 0;
        for(int i=0; i<len; i++) {
            if(row[i] && col[i]) {
                ct++;
            }
        }
        return ct;
    }
}