import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] matrix) {
        Map<Integer, List<Integer>> diagonalMap = new HashMap<>();
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                diagonalMap.putIfAbsent(key, new ArrayList<>());
                diagonalMap.get(key).add(matrix[i][j]);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : diagonalMap.entrySet()) {
            List<Integer> values = entry.getValue();
            if (entry.getKey() < 0) {
                Collections.sort(values);
            } else {
                values.sort(Collections.reverseOrder());
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                matrix[i][j] = diagonalMap.get(key).remove(0);
            }
        }

        return matrix;
    }
}