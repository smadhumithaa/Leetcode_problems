class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
         int end = s.length()-1;
        int res=-1;
        while(end>=0){
            int a = s.indexOf(s.charAt(end));
            if(a!=end)
                res = Math.max(res, end-a-1);
            end--;
        }
        return res;
    }
}
