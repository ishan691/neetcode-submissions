class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums); 

       for(int i=0; i<nums.length-2; i++){

        if (i > 0 && nums[i] == nums[i - 1]) continue;
        int first = i+1; 
        int last = nums.length-1;

        while(first < last){        
        int sum = nums[i] + nums[first] + nums[last];

            if(sum == 0){
                
                list.add(Arrays.asList(nums[i], nums[first], nums[last])); 
              
                while(first < last &&
                nums[first] == nums[first+1]){
                    first++; 
                } 
            
                while(first < last &&
                nums[last] == nums[last-1]){
                    last--; 
                } 

              first++; 
              last--;

            }
            else if(sum > 0) 
                last--; 
            else
                first++;
       }

    }
       
    return list; 
    }
}
