class Solution {
    public double trimMean(int[] arr) {
        int len=arr.length;
        int min = Arrays.stream(arr)
      .min()
      .getAsInt();
        int max = Arrays.stream(arr)
      .max()
      .getAsInt();
        double p=(len/100.0)*5;
        int mean=0;
        double c=0;
        Arrays.sort(arr);
        int a=(int)p;
        //System.out.println(a+" "+(a-1)+" "+(len-a-1));
        for(int i=a;i<len-a;i++){
            //System.out.print(arr[i]+" ");
            mean=arr[i]+mean;
            c++;
        }
        System.out.println(len+" "+mean+" "+c);
        double avg=mean/c;
        return avg;
    }
}
