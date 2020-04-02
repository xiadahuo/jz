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
    private TreeNode res = null;
    private int cnt = 1;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        inOrder(pRoot, k);
        return res;
    }
    public void inOrder(TreeNode pRoot, int k){
        if(pRoot == null) return;
        inOrder(pRoot.left, k);
        if(cnt == k) res = pRoot;
        cnt++;
        inOrder(pRoot.right,k);
    }
}

//优化 大于k 结束递归
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
    private TreeNode res = null;
    private int cnt = 1;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        inOrder(pRoot, k);
        return res;
    }
    public void inOrder(TreeNode pRoot, int k){
        if(pRoot == null) return;
        inOrder(pRoot.left, k);
        if(cnt == k) res = pRoot;
        cnt++;
        if(cnt <= k)inOrder(pRoot.right,k);
    }
}