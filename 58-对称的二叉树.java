/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null) return true;
        return dfs(pRoot.left,pRoot.right); 
    }
    public boolean dfs(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return left.val == right.val &&
            dfs(left.left,right.right) && dfs(left.right, right.left);
    }
}






