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


//先序非递归
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
    public void Mirror(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            if(cur != null){
                TreeNode help = cur.left;
                cur.left = cur.right;
                cur.right = help;
                stack.push(cur);
                cur = cur.left;
            }else{
                TreeNode temp = stack.pop();
                cur = temp.right;
            }
        }
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
//非递归实现
import java.util.*;
public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                TreeNode help = cur.left;
                cur.left = cur.right;
                cur.right = help;
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode temp = stack.pop();
            cur = temp.right;
        }
    }
}