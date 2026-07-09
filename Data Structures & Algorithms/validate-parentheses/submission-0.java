class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()%2 !=0){
            return false;
        }
        Stack<Character> stack1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack1.push(ch);
            }
            else{
                if(stack1.isEmpty()){
                    return false;
                }
                char top = stack1.peek();
                if ((ch == ')' && top == '(') || 
                    (ch == '}' && top == '{') || 
                    (ch == ']' && top == '[')) {
                    stack1.pop(); // Matching pair found, remove from stack
                }else{
                    return false;
                }
            }
        }
        return stack1.isEmpty();
    }
}
