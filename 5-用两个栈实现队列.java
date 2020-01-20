import java.util.Stack;


//push
//直接push到stack1

//pop
//如果stack2空。 将stack1中的数据push到stack2中，再从stack2中pop出去。
//如果stack2不空，直接从stack2中pop出去。

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
        if(stack2.isEmpty()){
           while(!stack1.isEmpty()){
               stack2.push(stack1.pop());
           } 
        }
        return stack2.pop();
    }
}