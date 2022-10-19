class Solution {
    public int sumBase(int n, int k) {
         String num=
           Integer.toString( Integer.parseInt(Integer.toString(n),10),k);
        int res= Integer.parseInt(num);
        int r=0;
        while(res>0){
            r=r+res%10;
            res=res/10;
        }
        //System.out.println(r);
        return r;
    }
}
