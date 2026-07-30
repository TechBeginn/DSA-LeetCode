class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int n= nums.length;
        int current =0;

        for(int i=0; i<n; i++){
            
            if(nums[i]==1){
                current++;
                max = Math.max(max, current);
            }
            else{
                current =0;
            }
            // max= Math.max(max, current);
        }
        return max;
    }
}