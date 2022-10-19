lass Solution {
    public String replaceDigits(String s) {
        char[] arr=new char[s.length()];
        for(int i=1;i<s.length();i++){
            arr[i-1]=s.charAt(i-1);
            //System.out.println((char)((int)s.charAt(i-1)+s.charAt(i)-'0'));
            arr[i]=(char)((int)s.charAt(i-1)+s.charAt(i)-'0');
            i++;
        }
        if(s.length()%2!=0)
            arr[s.length()-1]=s.charAt(s.length()-1);
        String string = new String(arr);
 
        return string;
        
    }
}
