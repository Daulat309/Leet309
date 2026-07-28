class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        String str = s.substring(0,n/2);
        char[] c = str.toCharArray();
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<c.length;i++) sb.append(c[i]);
        if(n%2!=0) sb.append(s.charAt(n/2));
        for(int i = c.length-1;i>=0;i--) sb.append(c[i]);
        return sb.toString();
    }
}