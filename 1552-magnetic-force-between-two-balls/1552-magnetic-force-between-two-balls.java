class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low =1;
        int high = 1;
        for(int pos:position){
            high= Math.max(high,pos);
        }
        while(low<high){
            int mid = low+(high-low+1)/2;
            if(check(mid,position,m)){
                low=mid;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
    public boolean check(int mid,int[] position, int m){
        int count =1;
        int lastpos = position[0];
        for(int i =1;i<position.length;i++){
            if(position[i]-lastpos>=mid){
                count++;
                lastpos=position[i];
            }
        }
        return count>=m;
    }
}