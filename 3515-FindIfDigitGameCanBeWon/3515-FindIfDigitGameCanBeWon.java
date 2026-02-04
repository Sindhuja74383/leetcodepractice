// Last updated: 2/4/2026, 12:11:06 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
      int sd=0;
        int dd=0;
        for(int i :nums){
            if(i<=9){
                sd+=i;
            }
            else{
                dd+=i;
            }
        }
        return sd!=dd;  
    }
}