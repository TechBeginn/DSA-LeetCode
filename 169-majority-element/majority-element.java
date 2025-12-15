import java.util.*;
class Solution {
    public static int majorityElement(int[] nums) {
        int count= 0;
        int n= nums.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[i]==nums[j])
                count++;
            }
            if(n/2 < count){
                return nums[i];
            }else{
                count=0;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++){ nums[i]= sc.nextInt();}
        System.out.println(majorityElement(nums));
    }
}