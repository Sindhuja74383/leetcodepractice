// Last updated: 2/4/2026, 12:11:53 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int maxright = -1;
        for (int i = arr.length -1;i>=0;i--){
            int temp = arr[i];
            arr[i] = maxright;
            if(temp>maxright){
                maxright = temp;
            }
        }
        return arr;
    }
}