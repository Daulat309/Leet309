class Solution {
    public List<String> validateCoupons(String[] code, String[] bs, boolean[] is) {
        int l = code.length;
        String[] cd = new String[l];
        String[] bl = new String[l];
        int k = 0;

        outer:
        for (int i = 0; i < l; i++) {

            if (code[i].length() == 0 || bs[i].length() == 0)
                continue;

            for (int j = 0; j < code[i].length(); j++) {
                char ch = code[i].charAt(j);
                if (!((ch == '_') ||
                      (ch >= 'A' && ch <= 'Z') ||
                      (ch >= 'a' && ch <= 'z') ||
                      (ch >= '0' && ch <= '9'))) {
                    continue outer;
                }
            }

            if (!(bs[i].equals("electronics") ||
                  bs[i].equals("grocery") ||
                  bs[i].equals("pharmacy") ||
                  bs[i].equals("restaurant")))
                continue;

            if (!is[i])
                continue;

            cd[k] = code[i];
            bl[k] = bs[i];
            k++;
        }

        String[] cdd = Arrays.copyOf(cd, k);
        String[] bll = Arrays.copyOf(bl, k);

        Integer[] idx = new Integer[k];
        for (int i = 0; i < k; i++) idx[i] = i;

        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);

        Arrays.sort(idx, (i, j) -> {
            int p1 = priority.get(bll[i]);
            int p2 = priority.get(bll[j]);
            if (p1 != p2) return p1 - p2;
            return cdd[i].compareTo(cdd[j]);
        });

        List<String> result = new ArrayList<>();
        for (int i : idx)
            result.add(cdd[i]);

        return result;
    }
}