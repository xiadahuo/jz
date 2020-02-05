import java.util.ArrayList;
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
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(root, target, res, new ArrayList<>());
        return res;
    }
    public void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> res,
                      ArrayList<Integer> temp){
        if(root == null) return;
        if(root.left == null && root.right == null && root.val == target){
            temp.add(root.val);
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }else if(root.left == null && root.right == null){
            return;
        }else{
            temp.add(root.val);
            helper(root.left, target-root.val, res, temp);
            helper(root.right, target-root.val, res, temp);
            temp.remove(temp.size()-1);
        }
    }
}



import java.util.ArrayList;
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
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(root, target, res, new ArrayList<>());
        return res;
    }
    public void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> res,
                      ArrayList<Integer> temp){
        if(root == null) return;
        temp.add(root.val);
        if(root.left == null && root.right == null && root.val == target){
            res.add(new ArrayList<>(temp));
        }else{
            helper(root.left, target-root.val, res, temp);
            helper(root.right, target-root.val, res, temp);
        }
        temp.remove(temp.size()-1);
    }
}



import java.util.ArrayList;
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
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(root, target, res, new ArrayList<>());
        return res;
    }
    public void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> res,
                       ArrayList<Integer> temp){
        if(root == null) return;
        //if(target < root.val) return;  //不能优化剪枝，可能为负数
        temp.add(root.val);
        if(root.left == null && root.right == null && root.val == target){
            res.add(new ArrayList<>(temp));
        }else{
            helper(root.left, target-root.val, res, temp);
            helper(root.right, target-root.val, res, temp);
        }
        temp.remove(temp.size()-1);
    }
}









