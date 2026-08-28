class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length ; 
        HashMap<Integer , Integer> map = new HashMap<>() ;
        for(int i =0 ; i< l ; i ++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else
            {
                map.put(nums[i] ,i) ; 
            }
        }
        return false ; 
    }
}