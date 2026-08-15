class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(5,0);
        mp.put(10,0);
        for(int i : bills){
            if(i==20){
                if((mp.get(10)>0&&mp.get(5)>0)||mp.get(5)>2){
                    if(mp.get(10)>0&&mp.get(5)>0){
                        mp.put(5, mp.get(5)-1);
                        mp.put(10, mp.get(10)-1);
                    }
                    else mp.put(5, mp.get(5)-3);
                }
                else return false;
            }
            else if(i==10){
                if(mp.get(5)>0){
                    mp.put(5, mp.get(5)-1);
                    mp.put(10, mp.get(10)+1);
                }
                else return false;
            }
            else mp.put(5, mp.get(5)+1);
        }
        return true;
    }
}