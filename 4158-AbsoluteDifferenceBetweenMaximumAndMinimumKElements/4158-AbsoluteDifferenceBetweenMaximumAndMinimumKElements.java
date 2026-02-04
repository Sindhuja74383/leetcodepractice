// Last updated: 2/4/2026, 12:10:52 PM
class Solution {
    public int absDifference(int[] nums, int k) {
       Arrays.sort(nums);
        int smallSum =0;
        int largeSum =0;
        int n = nums.length;
        for(int i=0;i<k;i++){
            smallSum += nums[i];
            largeSum += nums[n-1-i];
        }
        return Math.abs(largeSum - smallSum);
    }
}