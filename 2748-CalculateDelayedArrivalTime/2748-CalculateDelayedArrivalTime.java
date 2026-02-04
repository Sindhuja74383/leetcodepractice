// Last updated: 2/4/2026, 12:11:16 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
      return (arrivalTime + delayedTime) >=24 ? (arrivalTime+delayedTime)-24:(arrivalTime+delayedTime); 
    }
}