class Solution {

    public String makeLargestSpecial(String s) {
        char[] a = s.toCharArray();
        return f(a, 0, a.length);
    }

    private String f(char[] a, int l, int r) {
        int c = 0;
        int i = l;
        List<String> li = new ArrayList<>();

        for (int j = l; j < r; j++) {
            if (a[j] == '1') c++;
            else c--;

            if (c == 0) {
                String m = f(a, i + 1, j);
                li.add("1" + m + "0");
                i = j + 1;
            }
        }

        li.sort(Collections.reverseOrder());
        return String.join("", li);
    }
}