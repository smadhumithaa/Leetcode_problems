//Weekly contest 25
//507. Perfect Number
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        if(num%2!=0)
            return false;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
                //System.out.println(i);
            }
               
        }
        //int sum=Arrays.stream(arr).sum();
        //System.out.print(sum);
        if(sum==num)
        return true;
        else
            return false;
    }
}
