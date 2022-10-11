//Weekly contest 28
//551. Student Attendance Record I
class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        int ml=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
                a++;
            if(s.charAt(i)=='L')
                l++;
            else if(s.charAt(i)!='L'){
                ml=Math.max(ml,l);
                l=0;
            }  
        }
        if(ml==0)
            ml=l;
        System.out.print(a+" "+ml);
        if(a<2 && ml<=2)
            return true;
        return false;
    }
}

