import java.util.*;
class Solution {
    public int countTrapezoids(int[][] points) {
        long MOD = 1_000_000_007;

        Map<Integer, Long> yC = countYCoordinates(points);

        long totalTrapezoids = 0;
        long sumOfCombinationsSoFar = 0;

        for(long count : yC.values()){
            if(!hasAtLeastTwoPoints(count)){
                continue;
            }

            long combinations = combinationsOfTwo(count);

            totalTrapezoids = (totalTrapezoids + multiply(sumOfCombinationsSoFar, combinations,MOD)) % MOD;
            sumOfCombinationsSoFar = (sumOfCombinationsSoFar + combinations) % MOD;
        }

        return (int) totalTrapezoids;
    }

    private Map<Integer, Long> countYCoordinates(int[][] points){
        Map<Integer, Long> yC = new HashMap<>();
        for(int[] point : points){
            yC.put(point[1],yC.getOrDefault(point[1],0L)+1);
        }
        return yC;
    }

    private boolean hasAtLeastTwoPoints(long count){
        return count >= 2;
    }
    private long combinationsOfTwo(long count){
        return (count * (count-1)) / 2;
    }
    private long multiply(long a, long b, long mod){
        return (a*b)%mod;
    }
}