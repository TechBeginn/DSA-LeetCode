class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int Lp=0;
        int Rp=n-1;
        int max=Integer.MIN_VALUE;
        int area=0;
        while( Lp < Rp){
            area = Math.min(height[Lp], height[Rp])*(Rp - Lp);
            max = Math.max(area, max);
            if(height[Lp]< height[Rp]){
                Lp++;
            }
            else{
                Rp--;
            }
        }
        return max;
    }
}