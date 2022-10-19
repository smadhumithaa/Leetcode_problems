class Solution {
    public int minTimeToType(String word) {
        char start = 'a', end = ' ';
          int count =0;        
        for(int i=0;i<word.length();++i){          
            end = word.charAt(i);
            int num =Math.abs(start- end);
             count += (Math.min(num,26 -num));            
            start = end;
        }
        return count+ word.length();
    }
}
