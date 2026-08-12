class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<(long)m*k){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }
        while(low<high){
            int mid = low+(high-low)/2;
            int bouquet=0;
            int cosFlowers=0;
            for (int day : bloomDay) {
                if (day <= mid) {
                    cosFlowers++;
                    if (cosFlowers == k) {
                        bouquet++;
                        cosFlowers = 0;
                    }
                } else {
                    cosFlowers = 0;
                }
            }
            if(bouquet>=m){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}