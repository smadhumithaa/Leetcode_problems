//Weekly contest 21
//530. Minimum Absolute Difference in BST
class Solution {
    int min = Integer.MAX_VALUE; 
    Integer preValue = null; 
    public int getMinimumDifference(TreeNode root) {
        if(root == null) { 
            return min;
        }
        getMinimumDifference(root.left); 
        if(preValue != null) { 
            min = Math.min(min, root.val - preValue);
        }
        preValue = root.val;
        getMinimumDifference(root.right);
        return min;
    }
    
}
