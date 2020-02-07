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
    private TreeNode head = null;
    private TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(pre == null) head = root; //找到head时记录
        root.left = pre;
        if(pre != null) pre.right = root;
        pre = root;
        inOrder(root.right);
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
    private TreeNode head = null;
    private TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        if(pre != null) pre.right = root;
        root.left = pre;
        pre = root;
        if(head == null) head = root; //找到最左边第一个非空节点的时候记录
        inOrder(root.right);
    }
}


//非递归形式
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
import java.util.*;
public class Solution {
    private TreeNode head = null;
    private TreeNode pre = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }
    public void inOrder(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            TreeNode cur = stack.pop();
            if(head == null) head = cur;
            cur.left = pre;
            if(pre != null) pre.right = cur;
            pre = cur;
            root = cur.right;
        }
    }
}



