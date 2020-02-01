import java.util.Stack;

public class Solution {

    Stack<Integer> normalStack = new Stack<>();   //每次存push的数据
    Stack<Integer> minStack = new Stack<>();      //每次存当前的最小值
    public void push(int node) {
        normalStack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(node, minStack.peek()));    //压入当前最小值
    }
    
    public void pop() {
        normalStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return normalStack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}