class Solution {
    public int minOperations(String s) {
        char past = s.charAt(0);
        int cnt = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==past){
                cnt++;
                past = s.charAt(i)=='0'?'1':'0';
            }
            else past = s.charAt(i);
        }
        return Math.min(s.length()-cnt,cnt);
    }
}