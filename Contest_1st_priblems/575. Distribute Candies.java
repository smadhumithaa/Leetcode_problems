//Weekly Contest 31
//575. Distribute Candies
class Solution {
    public int distributeCandies(int[] c) {
        int n=c.length;
        int common=0;
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            s.add(c[i]);
        }
        int m=s.size();
        if(n/2>m)
            return m;
        return n/2;
    
    }
}
