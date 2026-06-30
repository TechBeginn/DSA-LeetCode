class Solution {
    public void moveZeroes(int[] nums) {
        // int fast= nums[0];
        int slow = 0;
        int n= nums.length;
        for(int fast=0; fast<n; fast++){
            if(nums[fast] != 0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
    }
}