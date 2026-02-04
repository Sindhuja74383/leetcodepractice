// Last updated: 2/4/2026, 12:11:24 PM
class Solution {
    public int numberOfCuts(int n) {
      if( n==1 )return 0;
      if(n % 2==0)return n/2;
      else
      return n;  
    }
}