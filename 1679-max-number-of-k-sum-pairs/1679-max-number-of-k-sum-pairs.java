class Solution {
    public int maxOperations(int[] nums, int k) {
        // int count=0;
        // Arrays.sort(nums);
        // int n=nums.length;
        // int i =0;
        // int j = n-1;
        // while(i<j){
        //     int sum = nums[i]+nums[j];
        //     if(sum==target){
        //         count++;
        //         i++;
        //         j--;
        //     }else if(sum<target){
        //         i++;
        //     }else{
        //         j--;
        //     }
        // }
        // return count;
        Map<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int i = 0; i < nums.length; i++){
            int res = k - nums[i];
            if(map.containsKey(res)){
                count++;
                if(map.get(res) == 1) map.remove(res);
                else map.put(res, map.get(res) - 1);
            }
            else{
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }   
}