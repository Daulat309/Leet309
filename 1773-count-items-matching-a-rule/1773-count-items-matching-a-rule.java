class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        for(int i = 0;i<items.size();i++){
            List<String> list =items.get(i);
            if(ruleKey.equals("color")){
                if(list.get(1).equals(ruleValue)) cnt++;
            }
            else if(ruleKey.equals("type")){
                if(list.get(0).equals(ruleValue)) cnt++;
            }
            else if(list.get(2).equals(ruleValue)) cnt++;
        }
        return cnt;
    }
}