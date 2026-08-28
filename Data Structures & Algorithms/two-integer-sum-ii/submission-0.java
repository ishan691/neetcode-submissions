class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length ; 
        int sum = 0 ; 
        for(int i=0 ; i<n ; i++){
            for(int j=0; j<n ; j++){
                sum = numbers[i] + numbers[j] ; 
                if(sum == target && numbers[i] < numbers[j] && numbers[i]!=numbers[j]){
                    return new int[]{i+1 , j+1} ; 
                }
            }
        }
        return new int[]{-1, -1} ; 
    }
}
