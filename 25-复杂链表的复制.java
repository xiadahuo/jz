/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) return null;
        RandomListNode cur = pHead;
        while(cur != null){ //复制每个节点
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = cur.next.next;
        }
        cur = pHead;
        while(cur != null){ //修改复制的节点的random指针
            if(cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        RandomListNode cloneHead = pHead.next;
        cur = pHead;
        while(cur != null){ //分离原链表与复制的链表
            RandomListNode next = cur.next;
            if(next != null){
                cur.next = next.next;
            }
            cur = next;
        }
        return cloneHead;
    }
}



/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
import java.util.*;
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) return null;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode cur = pHead;
        
        while(cur != null){
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }
        cur = pHead;
        RandomListNode cloneHead = map.get(cur);
        while(cur != null){
            RandomListNode clone = map.get(cur);
            clone.next = map.get(cur.next);
            clone.random = map.get(cur.random);
            cur = cur.next;
        }
        return cloneHead;
    }
}








