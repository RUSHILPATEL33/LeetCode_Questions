class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high =0;
        for(int wt : weights){
            low = Math.max(low,wt);
            high +=wt;
        }
        while (low < high) {
        int mid = low + (high - low) / 2;
        if (help(weights, days, mid)) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    return low;

    }
    private boolean help(int[] weights,int days, int cap){
    int d=1;
    int curr =0;
    for(int w:weights){
        if(curr+w>cap){
            d++;
            curr=0;
        }
        curr+=w;
    }
    return d<=days;
}
}
