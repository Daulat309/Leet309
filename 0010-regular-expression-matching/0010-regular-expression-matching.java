// class Solution { 
//     public boolean isMatch(String s, String p) { 
//         return check(s, p); 
//     } 
 
//     public boolean check(String s, String p) { 
        
//         if(s.length()==0 && p.length()==0) return true;
        
//         if(s.length()==0) { 
//             while(1 < p.length() && p.charAt(1) == '*') {
//                 p = p.substring(2);
//             }
//             return p.length()==0;
//         }
        
//         if(p.length()==0) return false; 
        
//         if(1 < p.length() && p.charAt(1) == '*') { 
            
//             if(p.charAt(0) == '.') { 
//                 return check(s.substring(1), p) || check(s, p.substring(2)); 
//             } 
//             else { 
//                 if(s.charAt(0) == p.charAt(0)) { 
//                     return check(s.substring(1), p) || check(s, p.substring(2)); 
//                 } 
//                 else { 
//                     return check(s, p.substring(2)); 
//                 } 
//             } 
//         } 
        
//         else if(p.charAt(0) == '.') { 
//             return check(s.substring(1), p.substring(1)); 
//         } 
        
//         else { 
//             if(s.charAt(0) != p.charAt(0)) return false; 
            
//             return check(s.substring(1), p.substring(1)); 
//         } 
//     } 
// }

class Solution {
    Boolean[][] dp;

    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length() + 1][p.length() + 1];
        return check(0, 0, s, p);
    }

    public boolean check(int i, int j, String s, String p) {

        if (j == p.length()) {
            return i == s.length();
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        boolean firstMatch = i < s.length() &&
                             (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        boolean ans;

        // x*
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // Option 1: skip x*
            // Option 2: consume one character
            ans = check(i, j + 2, s, p) ||
                  (firstMatch && check(i + 1, j, s, p));

        } else {

            // Normal character or '.'
            ans = firstMatch && check(i + 1, j + 1, s, p);
        }

        return dp[i][j] = ans;
    }
}