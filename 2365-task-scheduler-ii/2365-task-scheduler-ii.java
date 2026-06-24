import java.util.*;
class Solution {
    public long taskSchedulerII(int[] t, int n) {
        long k = 1;
        Map<Integer, Long> map = new HashMap<>();
        for(int i = 0;i<t.length;i++){
            if(!map.containsKey(t[i])){
                System.out.println(k+"  "+ t[i]);
                map.put(t[i],k);
                k++;
            }
            else{
                if(map.get(t[i])+n<k){
                    System.out.println(k+"  "+ t[i]);
                    map.put(t[i],k);
                    k++;
                }
                else{
                    k = map.get(t[i]) + n + 1;
                    System.out.println(k+"  "+ t[i]);
                    map.put(t[i],k);
                    k++;
                }
            }
        }
        k--;
        return k;
    }
}