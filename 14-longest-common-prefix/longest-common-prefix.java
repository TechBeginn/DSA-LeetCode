class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix= strs[0];
        // String real= "";
        String s1= strs[0];
        for(int a=1; a< strs.length; a++){
            String s2= strs[a];
            int i=0;
            String real="";
            while(i<s1.length() &&i<s2.length()){
                if(s1.charAt(i)==s2.charAt(i)){
                    real += s1.charAt(i);
                    i++;
                }else{
                    break;
                }
            }
            prefix= (real.length() < prefix.length())? real : prefix;
            s1 = prefix;
        }
        return prefix;
    }
}