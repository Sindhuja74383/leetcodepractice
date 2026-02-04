// Last updated: 2/4/2026, 12:11:12 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
      int roundedAmount = ((purchaseAmount + 5) / 10) * 10;
        return 100 - roundedAmount;
    }
}