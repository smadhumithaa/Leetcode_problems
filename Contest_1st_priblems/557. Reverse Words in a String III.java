//Weekly contest 27
//557. Reverse Words in a String III
class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int prev=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                 
                reverse(prev,i-1,arr);
                prev=i+1;
                
            }
        }
        reverse(prev,arr.length-1,arr);
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
