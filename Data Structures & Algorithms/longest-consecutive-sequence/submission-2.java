class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length ; 
        HashMap<Integer, Integer> map = new HashMap<>() ; 
        int i = 0 ; 
        while(i < n){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1) ; 
            i ++ ; 
        }
        int count = 1 ; 
        int maxLen = 0 ;
        for(int key : map.keySet()){
            if(!map.containsKey(key - 1)){
                int currentKey = key ; 
                count = 1 ; 

                while(map.containsKey(currentKey + 1)){
                    currentKey ++ ; 
                    count ++ ; 
                }
                maxLen = Math.max(maxLen , count) ; 
            }
        }
        return maxLen ; 
    }
}
