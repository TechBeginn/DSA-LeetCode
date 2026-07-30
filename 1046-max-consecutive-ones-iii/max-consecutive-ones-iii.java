class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max=0;

        for(int i=0; i<n; i++){
            int zeroCount =0;
            for(int j=i; j<n; j++){
                if(nums[j]==0){
                    zeroCount++;
                }
                if(zeroCount>k){
                    break;
                }
            max = Math.max(max, j-i+1);
            }
        }
        return max;
    }
}