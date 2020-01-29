/**
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
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        return isPart(root1, root2)||HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
    public boolean isPart(TreeNode root1, TreeNode root2){   //判断是否以root1为头节点，root2是root1的一部分
        if(root2 == null) return true;
        if(root1 == null || root1.val != root2.val) return false;
        return isPart(root1.left,root2.left) && isPart(root1.right,root2.right);
    }
}
