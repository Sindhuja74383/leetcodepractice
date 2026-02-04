// Last updated: 2/4/2026, 12:11:17 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k <= numOnes) return k;

        if( k <= numOnes + numZeros) return numOnes;

        return numOnes - (k - numOnes - numZeros);

    }
}