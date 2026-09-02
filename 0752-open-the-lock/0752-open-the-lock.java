class Solution {
    public int openLock(String[] deadends, String target) {

        HashSet<String> set = new HashSet<>();

        for (String s : deadends) {
            set.add(s);
        }

        // Starting position is blocked
        if (set.contains("0000")) {
            return -1;
        }

        // Already at target
        if (target.equals("0000")) {
            return 0;
        }

        Queue<String> q = new ArrayDeque<>();
        q.offer("0000");
        set.add("0000");

        int moves = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            // Process one BFS level
            while (size-- > 0) {

                String current = q.poll();

                if (current.equals(target)) {
                    return moves;
                }

                char[] ar = current.toCharArray();

                for (int i = 0; i < 4; i++) {

                    char original = ar[i];
                    int digit = original - '0';

                    ar[i] = (char) (((digit + 1) % 10) + '0');

                    String next = new String(ar);

                    if (set.add(next)) {
                        q.offer(next);
                    }

                    ar[i] = (char) (((digit + 9) % 10) + '0');

                    next = new String(ar);

                    if (set.add(next)) {
                        q.offer(next);
                    }

                    ar[i] = original;
                }
            }

            moves++;
        }

        return -1;
    }
}