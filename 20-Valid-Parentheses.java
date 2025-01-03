class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
       // stack.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        
        if(ch=='{' || ch=='[' || ch=='('){
            stack.push(ch);
        }
        else if(ch==')'){
            if(stack.isEmpty() || stack.peek()!='('){
                return false;
                }
                stack.pop();
        }
         else if(ch==']'){
            if(stack.isEmpty() || stack.peek()!='['){
                return false;
                }
                stack.pop();
        }
         else if(ch=='}'){
            if(stack.isEmpty() || stack.peek()!='{'){
                return false;
                }
                stack.pop();
        }
    }
        if(stack.isEmpty()){
            return true;
        }
        else{
        return false;
        }
    }
}