class Solution { 
    public int totalStrength(int[] strength) { 
        int n = strength.length; 
 
        int MOD = 1_000_000_007; 
 
        long[] preSum = new long[n + 1]; 
        long[] prePrefix = new long[n + 2]; 
 
        for (int i = 0; i < n; i++) { 
            preSum[i + 1] = (preSum[i] + strength[i]) % MOD; 
        } 
 
        for (int i = 0; i <= n; i++) { 
            prePrefix[i + 1] = (prePrefix[i] + preSum[i]) % MOD; 
        } 
 
        int[] left = new int[n]; 
        Stack<Integer> stack = new Stack<>(); 
 
        for (int i = 0; i < strength.length; i++) { 
            while (!stack.isEmpty() && strength[i] <= strength[stack.peek()]) { 
                stack.pop(); 
            } 
            left[i] = stack.isEmpty() ? -1 : stack.peek(); 
            stack.push(i); 
        } 
 
        int[] right = new int[n]; 
        stack = new Stack<>(); 
 
        for (int i = strength.length - 1; i >= 0; i--) { 
            while (!stack.isEmpty() && strength[i] < strength[stack.peek()]) { 
                stack.pop(); 
            } 
            right[i] = stack.isEmpty() ? n : stack.peek(); 
            stack.push(i); 
        } 
 
        long ans = 0; 
 
        for (int i = 0; i < n; i++) { 
            
            long rightPart = 
                (prePrefix[right[i] + 1] - prePrefix[i + 1] + MOD) % MOD;
            
            rightPart = (rightPart * (i - left[i])) % MOD;
            
            long leftPart = 
                (prePrefix[i + 1] - prePrefix[left[i] + 1] + MOD) % MOD;
            
            leftPart = (leftPart * (right[i] - i)) % MOD;
            
            long diff = (rightPart - leftPart + MOD) % MOD;
            
            long contribution = (diff * strength[i]) % MOD;
            
            ans = (ans + contribution) % MOD; 
        } 
 
        return (int) ans; 
    } 
}