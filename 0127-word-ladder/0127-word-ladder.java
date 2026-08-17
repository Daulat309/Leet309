class Pair {
    String ss;
    int cc;

    Pair(String ss, int cc) {
        this.ss = ss;
        this.cc = cc;
    }
}

class Solution {
    public int ladderLength(String bw, String ew, List<String> wl) {

        HashSet<String> set = new HashSet<>(wl);

        if (!set.contains(ew)) return 0;

        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(bw, 1));
        set.remove(bw);

        while (!q.isEmpty()) {

            Pair p = q.poll();
            String s = p.ss;
            int ct = p.cc;

            char[] arr = s.toCharArray();

            for (int i = 0; i < s.length(); i++) {

                char ch = arr[i];

                for (char c = 'a'; c <= 'z'; c++) {

                    if (ch == c) continue;

                    arr[i] = c;
                    String str = new String(arr);

                    if (str.equals(ew))
                        return ct + 1;

                    if (set.contains(str)) {
                        q.offer(new Pair(str, ct + 1));
                        set.remove(str);
                    }
                }

                arr[i] = ch;
            }
        }

        return 0;
    }
}