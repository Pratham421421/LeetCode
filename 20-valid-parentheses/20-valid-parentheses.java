class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }
            else {
                if(stk.size()==0){
                    return false;
                }
                if(stk.peek()=='(' && s.charAt(i)!=')' || stk.peek()=='{' &&                         s.charAt(i)!='}' || stk.peek()=='[' && s.charAt(i)!=']'){
                  return false;      
                }
                stk.pop();
            }
        }
                                                            
        return stk.isEmpty();
    }
}