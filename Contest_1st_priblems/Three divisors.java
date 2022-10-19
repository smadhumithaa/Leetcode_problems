class Solution {
    public boolean isThree(int n) {
        int c=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                c++;
        }
        if(c+1==3)
        return true;
        return false;
    }
}
