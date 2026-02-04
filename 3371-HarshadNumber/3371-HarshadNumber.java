// Last updated: 2/4/2026, 12:11:09 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int t = x;
        while(x!=0){
        sum += x%10;
        x/=10;
        }
        if(t%sum==0) return sum;
        else return -1;
    }
}