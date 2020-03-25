/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right != null){                         //如果有右孩子，往右后一直往左
            pNode = pNode.right;
            while(pNode.left != null) pNode = pNode.left;
            return pNode;
        }else{ //若无右孩子。1.该节点是父节点的左孩子，直接返回父节点  2.该节点是父节点的右孩子，往上找到第一个是父亲节点的左孩子，返回父亲节点
            while(pNode.next != null && pNode == pNode.next.right)
                pNode = pNode.next;
            return pNode.next;
        }
    }
}






