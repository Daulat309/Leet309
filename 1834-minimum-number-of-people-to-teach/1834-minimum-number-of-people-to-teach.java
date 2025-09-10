class Solution {
    public int minimumTeachings(int totalLanguages, int[][] userLanguages, int[][] friendships) {
        Set<Integer> usersToTeach = new HashSet<>();
        for (int[] f : friendships) {
            int u1 = f[0] - 1, u2 = f[1] - 1;
            boolean canCommunicate = false;
            for (int l1 : userLanguages[u1]) {
                for (int l2 : userLanguages[u2]) {
                    if (l1 == l2) {
                        canCommunicate = true;
                        break;
                    }
                }
                if (canCommunicate) break;
            }
            if (!canCommunicate) {
                usersToTeach.add(u1);
                usersToTeach.add(u2);
            }
        }

        int minUsersToTeach = userLanguages.length;
        for (int lang = 1; lang <= totalLanguages; lang++) {
            int count = 0;
            for (int user : usersToTeach) {
                boolean knows = false;
                for (int l : userLanguages[user]) {
                    if (l == lang) {
                        knows = true;
                        break;
                    }
                }
                if (!knows) count++;
            }
            minUsersToTeach = Math.min(minUsersToTeach, count);
        }
        return minUsersToTeach;
    }
}