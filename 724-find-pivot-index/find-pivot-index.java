class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int start =0;
        int sum=0;
        int Rsum=0, Lsum=0;

        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        for(int i=0; i<n; i++){
            Rsum = sum - Lsum - nums[i];
            if(Rsum == Lsum){
                return i;
            }
            Lsum += nums[i];
        }
        return -1;
    }
}