class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || 
           (!minStack.isEmpty() && val <= minStack.peek())){
            minStack.push(val);  
        }
    }
    
    public void pop() {
        if(stack.pop().equals(minStack.peek())) minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(minStack.isEmpty()) return 0;
        else return minStack.peek();
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