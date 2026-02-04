// Last updated: 2/4/2026, 12:11:02 PM
class Solution {
    public int countPartitions(int[] nums, int k) {
       int n = nums.length;
        int MOD = 1_000_000_007;
        
        long[] dp = new long[n + 1];   // dp[i] = ways to partition first i elements
        long[] prefix = new long[n + 1]; // prefix sums for fast range sum
        dp[0] = 1;
        prefix[0] = 1;
        
        // Deques to maintain min and max in sliding window
        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();
        
        int left = 0;
        for (int right = 0; right < n; right++) {
            // Maintain deques
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right]) 
                minDeque.pollLast();
            minDeque.addLast(right);
            
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) 
                maxDeque.pollLast();
            maxDeque.addLast(right);
            
            // Shrink left until valid
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > k) {
                if (minDeque.peekFirst() == left) minDeque.pollFirst();
                if (maxDeque.peekFirst() == left) maxDeque.pollFirst();
                left++;
            }
            
            // dp[right+1] = sum of dp[left..right]
            dp[right+1] = (prefix[right] - (left > 0 ? prefix[left-1] : 0) + MOD) % MOD;
            prefix[right+1] = (prefix[right] + dp[right+1]) % MOD;
        }
        
        return (int) dp[n];
  
    }
}