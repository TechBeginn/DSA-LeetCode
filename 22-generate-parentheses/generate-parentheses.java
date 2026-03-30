class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list= helper("",n, 0, 0);
        return list;
    }
    public List<String> helper(String str, int r, int open, int close){
        List<String> list= new ArrayList<>();
        if(r*2== str.length()){
            list.add(str);
            return list;
        }
        if(open<r){
            list.addAll(helper(str + "(",r, open+1, close));
        }
        if(close<open){
            list.addAll(helper(str + ")", r, open, close+1));
        }
        return list;
    }
}