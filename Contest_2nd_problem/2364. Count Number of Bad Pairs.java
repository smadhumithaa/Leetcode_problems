//Biweekly contest 84
//2364. Count Number of Bad Pairs
class Solution {
    public long countBadPairs(int[] num) {
        int c=0;
        int n=num.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(j - i != num[j] - num[i])
                    c++;
            }
        }
        return c++;
    }
}
