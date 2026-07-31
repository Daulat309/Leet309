class Solution {
    public int minimumPushes(String word) {
        int cnt = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        Queue<Character> q = new PriorityQueue<>(
            (a,b) -> {return Integer.compare(mp.get(b),mp.get(a));}
        );
        
        for(int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(Character c : mp.keySet()){
            q.offer(c);
        }
        int k = 0;
        for(int i = 0;i<8&&!q.isEmpty();i++){
            char c = q.poll();
            cnt += mp.get(c);
            k++;
        }
        for(int i = 0;i<8&&!q.isEmpty();i++){
            char c = q.poll();
            cnt += mp.get(c)*2;
        }
        for(int i = 0;i<8&&!q.isEmpty();i++){
            char c = q.poll();
            cnt += mp.get(c)*3;
        }
        for(int i = 0;i<2&&!q.isEmpty();i++){
            char c = q.poll();
            cnt += mp.get(c)*4;
        }
        return cnt;
    }
}