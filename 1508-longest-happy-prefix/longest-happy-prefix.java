class Solution {
    public String longestPrefix(String s) {
        int len= s.length();
        int[] prefix= new int[len];
        int i=0, j=1;
        while(j<len){
            if(s.charAt(i)== s.charAt(j)){
                i++;
                prefix[j]=i;
                j++;
            }else{
                if(i==0) j++;
                else i=prefix[i-1];
            }
        }
        return s.substring(0,i);
    }
}
