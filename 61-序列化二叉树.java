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
import java.util.*;
public class Solution {
    private static final String spliter = "!";
    private static final String NN = "#";
    int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null){
            sb.append(NN).append(spliter);
        }else{
            sb.append(root.val).append(spliter);
            sb.append(Serialize(root.left));
            sb.append(Serialize(root.right));
        }
        return sb.toString();
   }
    TreeNode Deserialize(String str) {
       List<String> strr = Arrays.asList(str.split(spliter));
       return buildTree(strr);
    }
    public TreeNode buildTree(List<String> strr){
        index++;
        String val = strr.get(index);
        TreeNode root = null;
        if(!val.equals(NN)){
            root = new TreeNode(Integer.valueOf(val));
            root.left = buildTree(strr);
            root.right = buildTree(strr);
        }
        return root;
    }
}






















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
import java.util.*;
public class Solution {
    private static final String spliter = "!";
    private static final String NN = "#";
    int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null){
            sb.append(NN).append(spliter);
        }else{
            sb.append(root.val).append(spliter);
            sb.append(Serialize(root.left));
            sb.append(Serialize(root.right));
        }
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
       List<String> strr = Arrays.asList(str.split(spliter));
       index++;
       String val = strr.get(index);
       TreeNode root = null;
       if(!val.equals(NN)){
           root = new TreeNode(Integer.valueOf(val));
           root.left = Deserialize(str);
           root.right = Deserialize(str);
       }
       return root;
    }
}









