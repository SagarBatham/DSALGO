// 155. Min Stack

import java.util.Stack;

public class Prob_155 {
    public static void main(String[] args) {
        class MinStack {
    Stack<Integer> stk;
    Stack<Integer> min;
    public MinStack() {
       stk= new Stack<>();
       min=new Stack<>();
    }
    
    public void push(int val) {
        if(stk.size()==0 || val <= min.peek()){
            min.push(val);
        }
        stk.push(val);
    }
    
    public void pop() {
        int ele1=stk.pop();
        int ele2=min.peek();
        if(ele1==ele2){
            min.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
    }
}
