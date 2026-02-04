// Last updated: 2/4/2026, 12:10:57 PM
class Solution {
     private static final int MOD = 1_000_000_007;
    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> yCount = new HashMap<>();
        for (int[] p : points) {
            yCount.put(p[1], yCount.getOrDefault(p[1], 0) + 1);
        }
        long sumPairs = 0;
        long sumSquares = 0;
        for (int count : yCount.values()) {
            if (count >= 2) {
                long pairs = (long) count * (count - 1) / 2;
                sumPairs = (sumPairs + pairs) % MOD;
                sumSquares = (sumSquares + pairs * pairs) % MOD;
            }
        }
        long ans = (sumPairs * sumPairs % MOD - sumSquares + MOD) % MOD;
        ans = ans * ((MOD + 1) / 2) % MOD; 
        return (int) ans;
    
    }
}