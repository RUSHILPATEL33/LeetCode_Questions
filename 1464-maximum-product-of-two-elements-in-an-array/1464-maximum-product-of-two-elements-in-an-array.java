class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        //int max = 0;
        Arrays.sort(nums);
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}