class Solution {
    public int[] replaceElements(int[] arr) {
        int maxRight = -1;  
        int[] ans = new int[arr.length]; 
        int index = arr.length-1;
    
        for(int i=arr.length-1; i>=0; i--){
            ans[index--] = maxRight;          
            maxRight = Math.max(maxRight, arr[i]);
        }
        return ans; 
    }
}