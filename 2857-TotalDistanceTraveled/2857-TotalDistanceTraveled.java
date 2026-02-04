// Last updated: 2/4/2026, 12:11:13 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int total = 0;
        while (mainTank >= 5) {
            total += 50;
            mainTank -= 5;
            if (additionalTank >= 1) {
                mainTank++;
                additionalTank--;
            }
        }
        return total + (mainTank * 10);
    }
}