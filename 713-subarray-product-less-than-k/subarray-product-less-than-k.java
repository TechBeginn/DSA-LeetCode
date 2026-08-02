class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       
        int n = nums.length;
        int count =0;

        for(int right =0; right<n; right++){
            int product =1;
            for(int i=right; i<n; i++){
                product *= nums[i];
               if(product<k){
                count++;
               }
               else{
                break;
               }
            }
        }
        return count;
    }
}