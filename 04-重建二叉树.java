//传统做法
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null || pre.length == 0 || in.length == 0)
            return null;
        return helper(pre, in, 0, pre.length-1, 0, in.length-1);
    }
    public TreeNode helper(int[] pre, int[] in, int preL, int preR, int inL, int inR){
        if(preL > preR || inL > inR) return null;
        TreeNode root = new TreeNode(pre[preL]);
        int pos = inL;          //找到in数组中root的位置
        for(;pos <= inR; pos++){
            if(in[pos] == root.val) break;
        }
        int leftSize = pos - inL; //左子树大小
        root.left = helper(pre, in, preL+1, preL+leftSize, inL, pos-1);
        root.right = helper(pre, in, preL+leftSize+1,preR, pos+1, inR);
        return root;
    }
}

//map优化寻找in数组位置
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null || pre.length == 0 || in.length == 0)
            return null;
        Map<Integer,Integer> inMap = new HashMap<>();
        for(int i = 0; i < in.length; i++){
            inMap.put(in[i],i);
        }
        return helper(pre, in, 0, pre.length-1, 0, in.length-1, inMap);
    }
    public TreeNode helper(int[] pre, int[] in, int preL, int preR, int inL, int inR,
                          Map<Integer,Integer> inMap){
        if(preL > preR || inL > inR) return null;
        TreeNode root = new TreeNode(pre[preL]);
        int pos = inMap.get(root.val); //找到in数组中root的位置
        int leftSize = pos - inL; //左子树大小
        root.left = helper(pre, in, preL+1, preL+leftSize, inL, pos-1,inMap);
        root.right = helper(pre, in, preL+leftSize+1,preR, pos+1, inR, inMap);
        return root;
    }
}