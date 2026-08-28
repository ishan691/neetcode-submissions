class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0; 

        for(int pile : piles){
            high = Math.max(high, pile); 
        }

        int k = 0; 
        while(low <= high){
            int mid = low + (high-low)/2; 
            int total = totalTime(piles, mid); 

            if(total <= h){
                k = mid; 

                high = mid -1; 
            }
            else{
                low = mid +1; 
            }
        }

        return k;
    }

    public int totalTime(int[] piles, int speed){
        int ans = 0; 

        for(int pile : piles){
            ans += (pile + speed -1)/speed; 
        }

        return ans; 
    }
}


