class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> st = new Stack<>(); 
        int[] ans = new int[arr.length]; 
        int index = arr.length-1;
        
        st.push(arr[arr.length-1]);
        ans[index--] = -1;
        
        for(int i=arr.length-2; i>=0; i--){
            ans[index--] = st.peek();         
            if(arr[i]> st.peek()){
                st.push(arr[i]);
            }
        }
        return ans; 
    }
}