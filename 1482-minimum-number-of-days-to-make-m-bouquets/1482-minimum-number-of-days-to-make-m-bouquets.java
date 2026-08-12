class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if ((long) m * k > bloomDay.length) {
            return -1;  
        }
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int b:bloomDay){
            low=Math.min(low,b);
            high=Math.max(high,b);
        }
        while(low<high){
            int mid = low+(high-low)/2;
            if(help(bloomDay,m,k,mid)){
                high =mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean help(int[] bloomDay, int m, int k, int mid){
        int cnt=0;
        int bCount=0;
        for(int day:bloomDay){
            if(day<=mid){
                cnt++;
                if(cnt==k){
                    bCount++;
                    cnt=0;
                }
            }else{
                    cnt=0;
                }
        }
        return bCount>=m;
    }
}