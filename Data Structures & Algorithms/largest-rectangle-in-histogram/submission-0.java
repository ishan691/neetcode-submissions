class Solution {
    public int largestRectangleArea(int[] heights) {
          int n = heights.length; 
        int maxArea = 0; 

        // int[] pse = previousSmaller(heights); 
        // int[] nse = nextSmaller(heights); 

        // for(int i=0 ; i<n ; i++){
        //     int width = nse[i] - pse[i] - 1; 
        //     maxArea = Math.max(width*heights[i] , maxArea); 
        // }

        // return maxArea; 

        Stack<Integer> st = new Stack<>(); 

        for(int i=0; i<n ;i++){

            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int height = heights[st.pop()];  
                int left = 0 ;

                if(st.isEmpty()) left = -1; 
                else{
                    left = st.peek(); 
                }
                int right = i; 
                int width = right - left - 1; 
                maxArea = Math.max(maxArea, height * width); 

            }

            st.push(i); 
        }

        while(!st.isEmpty()){
                int height = heights[st.pop()]; 
                int left = 0 ;

                if(st.isEmpty()) left = -1; 
                else{
                    left = st.peek(); 
                }
                int right = n; 
                int width = right - left - 1; 
                maxArea = Math.max(maxArea, height * width); 

        }
            return maxArea;
    }
}
