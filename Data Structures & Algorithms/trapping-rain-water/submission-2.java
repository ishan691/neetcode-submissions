class Solution {
    public int trap(int[] height) {
        int left = 0; 
        int right = height.length -1;
        int leftMax = height[left]; 
        int rightMax = height[right]; 
        int total = 0;

        while(left < right){

            if(height[left] < height[right]){
                leftMax = Math.max(leftMax, height[left]);
                int water = leftMax- height[left];  
                total = total + water; 
                left++; 
            }
            else{
                rightMax = Math.max(rightMax, height[right]); 
                int water = rightMax - height[right];
                total = total + water;
                right--; 
            }
        }

        return total; 
    }
}
