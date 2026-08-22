class Solution {
    public int maxOperations(int[] nums, int target) {
        int count=0;
        Arrays.sort(nums);
        int n=nums.length;
        int i =0;
        int j = n-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum==target){
                count++;
                i++;
                j--;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        return count;
    }   
}