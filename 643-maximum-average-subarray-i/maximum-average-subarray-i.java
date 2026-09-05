class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        double avg;
        double max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            sum += nums[i];
            max= sum/k;
        }
        for(int i=0; i<nums.length-k; i++){
            sum = sum - nums[i] + nums[i+k];
            avg = sum/k;
            max = Math.max(max, avg);
        }
        return max;
    }
}