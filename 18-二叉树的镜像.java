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
    public void Mirror(TreeNode root) {
        helper(root);
    }
    public TreeNode helper(TreeNode root){
        if(root == null) return null;
        TreeNode temp = helper(root.left);
        root.left = helper(root.right);
        root.right = temp;
        return root;
    }
}





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
    public void Mirror(TreeNode root) {
        if(root == null) return;
        Mirror(root.left);
        Mirror(root.right);
        swap(root);
    }
    public void swap(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}