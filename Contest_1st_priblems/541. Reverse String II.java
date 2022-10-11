//Weekly contest 23
//541. Reverse String II
class Solution {
    public String reverseStr(String s, int k) {
        if(s.length()==1)
            return s;
        char [] arr=s.toCharArray();
        for(int i=0;i<arr.length-1;i=i+2*k){
            reverse(i,Math.min(i+k-1,arr.length-1),arr);
        }
        return new String(arr);
    }
    public void reverse(int i, int j, char[] str){
    while(i < j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }
    
    
}
}
