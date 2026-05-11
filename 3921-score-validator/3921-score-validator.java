class Solution {
    public int[] scoreValidator(String[] events) {
        int[] res = new int[2];

        for (String s : events) {
            if (s.equals("W")) {
                res[1]++;
            } else {
                res[0] += val(s);
            }
            if(res[1]>=10) return res;
        }

        res[1] = Math.min(10, res[1]);
        return res;
    }

    public int val(String s) {
        switch (s) {
            case "WD":
            case "NB":
            case "1":
                return 1;

            case "2":
                return 2;

            case "3":
                return 3;

            case "4":
                return 4;

            case "6":
                return 6;

            default:
                return 0;
        }
    }
}