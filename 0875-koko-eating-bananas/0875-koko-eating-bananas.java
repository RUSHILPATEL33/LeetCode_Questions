class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = 0;
        int ans =high;
        for (int p : piles) {
            high = Math.max(high, p);
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(help(piles,mid,h)){
                ans = mid;
                high =mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public boolean help(int[] piles,int mid ,int h){
        long hours =0;
        for(int pile :piles){
            hours +=(pile + mid-1)/mid;
        }
        return hours<=h;
    }
}