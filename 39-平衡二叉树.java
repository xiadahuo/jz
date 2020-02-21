//O(nlog n)   获得每一层高度，需要遍历n个节点，log n 层
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) return true;
        int left = height(root.left);
        int right = height(root.right);
        return Math.abs(left-right) <= 1 && IsBalanced_Solution(root.left)
            && IsBalanced_Solution(root.right);
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }
}

//O(n) 每个节点只需要遍历一次
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        return height(root) != -1;        //-1表示不平衡
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        if(left == -1) return -1;         //左子树不平衡直接返回-1
        int right = height(root.right);
        if(right == -1) return -1;        //右子树不平衡直接返回-1
        return Math.abs(left-right) <= 1 ? Math.max(left, right)+1 : -1;  //平衡返回高度，不平衡返回-1
    }
}

//O(n) 全局变量只遍历所有节点一次
public class Solution {
    boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        height(root);
        return isBalanced;
    }
    public int height(TreeNode root){
        if(root == null || !isBalanced) return 0;  //优化，提前返回
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right) > 1) isBalanced = false;
        return Math.max(left,right)+1;
    }
}