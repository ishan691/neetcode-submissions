class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>(); 

        for(int i=0; i<tokens.length; i++){

            if(tokens[i].equals("+")
            || tokens[i].equals("-")
            || tokens[i].equals("*")
            || tokens[i].equals("/")){
            
            int a = st.pop(); 
            int b = st.pop(); 
            int operation = 0; 

            if(tokens[i].equals("+")){
                 operation = b + a; 
            }

            if(tokens[i].equals("-")){
                  operation = b - a; 
            }

            if(tokens[i].equals("*")){
                  operation = b * a; 
            }

            if(tokens[i].equals("/")){
                  operation = b / a; 
            }
            
            st.push(operation); 
            }

            else{
                int value = Integer.parseInt(tokens[i]); 
                st.push(value); 
            }
            
        } 

        return st.pop();        
    }
}
