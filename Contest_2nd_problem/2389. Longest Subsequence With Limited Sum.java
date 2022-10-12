//Weekly contest 308
//2389. Longest Subsequence With Limited Sum
class Solution {
    private int mod=1000000007;
    public int numberOfWays(int s, int e, int k) {
        int[][] dp=new int[3002][1001];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return top(s,e,s,k,dp);
    }
    public int top(int s,int e,int curr,int k,int[][] dp){
        if(k==0){
            if(curr==e)
                return 1;
            else 
                return 0;
        }
        if(dp[curr+1001][k]!=-1)
            return dp[curr+1001][k];
         int r=top(s,e,curr+1,k-1,dp);
        int l=top(s,e,curr-1,k-1,dp);
        return dp[curr+1001][k]=(r+l)%mod;
    }
}
