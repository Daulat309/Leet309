class Solution {
    public int digitFrequencyScore(int n) {
        String s = String.valueOf(n);
        int[] a = new int[10];
        int sm = 0;
        for(int i = 0;i<s.length();i++){
            //System.out.println(s.charAt(i)-'0');
            a[s.charAt(i)-'0']++;
            sm += (s.charAt(i)-'0')*a[s.charAt(i)-'0'];
            //System.out.println(sm);
            sm -= (s.charAt(i)-'0')*(a[s.charAt(i)-'0']-1);
            //System.out.println(sm);
        }
        return sm;
    }
}