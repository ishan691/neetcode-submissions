class Solution {
    public boolean isAnagram(String s, String t) {
        int i = 0; 

        if(s.length() != t.length()) return false; 

        HashMap<Character, Integer> map1 = new HashMap<>(); 
        HashMap<Character, Integer> map2 = new HashMap<>(); 

        for(int j=0; j<s.length(); j++){
            map1.put(s.charAt(j), map1.getOrDefault(s.charAt(j) ,0) + 1); 
        }


        for(int j=0; j<t.length(); j++){
            map2.put(t.charAt(j), map2.getOrDefault(t.charAt(j) ,0) + 1);  
        }

        if(map1.equals(map2)) return true; 

        return false; 
    }
}
