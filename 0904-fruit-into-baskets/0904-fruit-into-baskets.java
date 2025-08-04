class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int i = 0, j = 0;

        while (j < n) {
            // Add current fruit to the map
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            // If we have more than 2 types, shrink window from left
            while (map.size() > 2) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]); // Remove type with zero count
                }
                i++; // Shrink window
            }

            // Update max length of valid window
            max = Math.max(max, j - i + 1);
            j++; // Expand window
        }

        return max;
    }
}