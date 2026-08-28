class Solution {
    public int findLucky(int[] arr) {
       Map<Integer, Integer> map = new HashMap<>(); 
       int maxLucky = -1; 
        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) +1); 
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int key = entry.getKey();
        int value = entry.getValue();
        
        if (key == value) {
            maxLucky = Math.max(maxLucky, value);
        }
    }

        return maxLucky; 
    }
}