class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff=0;
        
        int[] res= new int[2];
        for(int i=0; i<nums.length; i++){
            diff = target - nums[i];
            for(int j=i+1; j<nums.length; j++)
            if(diff == nums[j]){
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}