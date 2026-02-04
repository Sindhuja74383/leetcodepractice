// Last updated: 2/4/2026, 12:11:20 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = n - 1;

        int rounds = time / cycle;

        int rem = time % cycle;

        if (rounds % 2 == 0) {
            return 1 + rem;   
        } else {
            return n - rem;   
        }

    }
}