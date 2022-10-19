class Solution {
    public int findGCD(int[] nums) {
        int max = Arrays.stream(nums)
  .max()
  .getAsInt();

int min = Arrays.stream(nums)
  .min()
  .getAsInt();
        int g=gcd(min,max);
        return g;
    }
    public int gcd(int a,int b){
        if (a == 0)
            return b;
 
        return gcd(b % a, a);
    }
}
