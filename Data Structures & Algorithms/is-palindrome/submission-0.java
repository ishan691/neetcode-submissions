class Solution {
    public boolean isPalindrome(String s) {

        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] ans = result.toCharArray(); 

        int first = 0; 
        int last = ans.length-1;

        while(first < last){
            if(ans[first] != ans[last]) return false; 
            first++; 
            last--; 
        } 

        return true; 
    }
}
