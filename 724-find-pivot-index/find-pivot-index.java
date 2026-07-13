class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int start =0;
        while(start<n){
            int sumR=0, sumL=0;
            for(int i=start +1; i<n; i++){
                sumR += nums[i];
            }
            for(int i=0; i<start; i++){
                sumL += nums[i];
            }
            if(sumL == sumR){
                return start;
            }
            start++;
        }
        return -1;
    }
}