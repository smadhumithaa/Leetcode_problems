class Solution {
    public int maxDepth(String s) {
      int ans = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            }
            else if (s.charAt(i) == ')') {
                left--;
            }
            ans = Math.max(ans, left);
        }
        return ans;
  
    }
}
