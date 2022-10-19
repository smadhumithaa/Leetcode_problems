class Solution {
    public boolean isPrefixString(String s, String[] words) {                   
            StringBuilder sb = new StringBuilder("");
        for (String str : words) {
            sb.append(str);
            if (sb.toString().startsWith(s) && s.length()>=sb.toString().length()) {
                return true;
            }
        }
        return false;
    }
}
