class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int LeftSum=0, RightSum=0;
        int sum=0;

        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        for(int i=0; i<n; i++){
            RightSum = sum - LeftSum- nums[i];
            if(RightSum == LeftSum){
                return i;
            }
            LeftSum += nums[i];
        }
        return -1;    
    }
}