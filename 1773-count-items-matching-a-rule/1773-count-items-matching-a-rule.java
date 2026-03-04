class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        int idx = 2;
        if(ruleKey.equals("type")) idx = 0;
        else if(ruleKey.equals("color")) idx = 1;
        for(List<String> list : items){
            if(list.get(idx).equals(ruleValue)) cnt++;
        }
        return cnt;
    }
}