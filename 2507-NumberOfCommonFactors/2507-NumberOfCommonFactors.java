// Last updated: 2/4/2026, 12:11:28 PM
class Solution {
    public int commonFactors(int a, int b) {
       int min = a<b? a:b;
        int count =0;
    for (int i = 1;i<= min;i++){
        if(a%i==0 && b%i ==0) count ++;
    }
    return count;
    }
}