class Solution {
    public int splitArray(int[] arr, int k) {
        long low = -1;
        long high = 0;
        long res =0;
        if(arr.length<k){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            low = Math.max(low,arr[i]);
            high += arr[i];
        }
        while(low<=high){
            long mid = low+(high-low)/2;
            if(help(mid,arr,k)){
                res=mid;
                high = mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)res;
    }
    public boolean help(long mid,int[] arr,int k){
        int allocatedStudent=1;
        long pages =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid){
                return false;
            }
            if(pages+arr[i]>mid){
                allocatedStudent++;
                pages=arr[i];
            }else{
                pages+=arr[i];
            }
        }
        return (allocatedStudent<=k);
    }
}