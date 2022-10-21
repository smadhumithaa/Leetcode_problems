class Solution {
   public int numWaterBottles(int bottles, int exchange){
         int ans = bottles;
        int empty = ans;
        int rem=0;
        while(empty/exchange>=1){
            bottles = empty/exchange;
            rem = empty%exchange;
            ans = ans + bottles;
            empty = rem + bottles;
        }
        return ans;
    }
}
