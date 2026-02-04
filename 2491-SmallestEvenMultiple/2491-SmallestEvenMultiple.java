// Last updated: 2/4/2026, 12:11:29 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }else{
            return 2*n;
        }
    }
}