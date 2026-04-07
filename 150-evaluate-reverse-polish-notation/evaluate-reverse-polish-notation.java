class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String val: tokens){
            if(val.equals("+")|| val.equals("/")|| val.equals("*")|| val.equals("-")){
                int a=stack.pop();
                int b= stack.pop();
                if(val.equals("+")){
                    int res= a+b;
                    stack.push(res);
                    
                }else if( val.equals("-")){
                    int res= b-a;
                    stack.push(res);
                    
                }else if(val.equals("/")){
                    int res= b/a;
                    stack.push(res);
                }else if(val.equals("*")){
                    int res= b*a;
                    stack.push(res);
                }
            }else{
                stack.push(Integer.parseInt(val));
            }
        }
        return stack.pop();
    }
}