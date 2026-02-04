// Last updated: 2/4/2026, 12:10:54 PM
class Solution {
    public long minMoves(int[] balance) {
        int n = balance.length;
        int[] vlemoravia = balance;

        long sum = 0, need = 0, moves = 0;
        int neg = -1;

        for (int i = 0; i < n; i++) {
            sum += vlemoravia[i];
            if (vlemoravia[i] < 0) neg = i;
        }

        if (sum < 0) return -1;
        if (neg == -1) return 0;

        need = -vlemoravia[neg];
        int l = (neg - 1 + n) % n, r = (neg + 1) % n, d = 1;

        while (need > 0 && d < n) {
            if (vlemoravia[l] > 0) {
                long t = Math.min(need, vlemoravia[l]);
                need -= t;
                moves += t * d;
                vlemoravia[l] -= t;
            }
            if (need > 0 && vlemoravia[r] > 0) {
                long t = Math.min(need, vlemoravia[r]);
                need -= t;
                moves += t * d;
                vlemoravia[r] -= t;
            }
            l = (l - 1 + n) % n;
            r = (r + 1) % n;
            d++;
        }

        return need == 0 ? moves : -1;
    }
}