class Solution {
    public int mySqrt(int x) {
        int low =0;
        int high =x;
        while(low<=high){
            int mid = low+(high-low)/2;
            long ans = (long)mid*mid;
            if(x==ans){
                return mid;
            }else if(x<ans){
                high =mid-1;
            }else{
                low = mid+1;
            }
        }
        return high;
    }
}