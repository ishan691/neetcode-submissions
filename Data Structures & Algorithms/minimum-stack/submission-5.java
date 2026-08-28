class MinStack {

    Stack<Integer> st; 
    Stack<Integer> min; 

    public MinStack() {
        st = new Stack<Integer>(); 
        min = new Stack<Integer>();    
    }
    
    public void push(int val) {
      st.push(val); 
     if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
    }
    
    public void pop() {
        if (st.isEmpty()) {
        return;
    }

    int removed = st.pop();

    if (removed == min.peek()) {
        min.pop();
    }
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }
        else{
            return 0; 
        }
    }
    
    public int getMin() {
         if(!min.isEmpty()){
            return min.peek();
        }
        else{
            return 0; 
        }
    }
}
