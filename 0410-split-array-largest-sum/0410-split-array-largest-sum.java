class Solution {
    public int splitArray(int[] nums, int k) {
        long low =-1;
        long high =0;
        long res =-1;
        for(int i:nums){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            long mid = low+(high-low)/2;
            if(help(nums,k,mid)){
                res =mid;
                high =mid-1;
            }else{
                low = mid+1;
            }
        }
        return (int)res;
    }
    public boolean help(int[] nums,int k, long mid){
        int s=1;
        long sum=0;
        for(int ss:nums){
            if(sum+ss>mid){
                s++;
                sum=ss;
            }else{
                sum+=ss;
            }
        }
        return s<=k;
    }
}