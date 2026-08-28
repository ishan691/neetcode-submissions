class Solution {
    public int longestConsecutive(int[] nums) {
        int length = 0; 
        HashSet<Integer> set = new HashSet<>(); 
    
        for(int x : nums){
            set.add(x); 
        }

        for(int i=0; i<nums.length; i++){
            int count = 0; 
            int x = nums[i]; 
            if(!set.contains(x-1)){
                count++; 
                while(set.contains(x+1)){
                    count++; 
                    x++;
                }
            }
            length = Math.max(count, length); 
        }

        return length; 
    }
}
