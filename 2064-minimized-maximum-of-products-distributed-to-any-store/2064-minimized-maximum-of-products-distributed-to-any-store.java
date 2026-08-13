class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        long low=1;
        long high=0;
        long ans =-1;
        for(int i:quantities){
            high=Math.max(high,i);
        }
        while(low<high){
            long mid = low+(high-low)/2;
            if(help(n,quantities,mid)){
                ans = mid;
                high =mid;
            }else{
                low = mid+1;
            }
        }
        return (int)low;
    }
    public boolean help(int n, int[] quantities, long mid){
        int st=0;
        for(int i:quantities){
            st+=(i+mid-1)/mid;
        }
        return st<=n;
    }
}