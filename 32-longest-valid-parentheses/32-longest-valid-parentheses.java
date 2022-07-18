class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>stk = new Stack<>();
        stk.push(-1);
        int max=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stk.push(i);
            else{
                stk.pop();
                if(!stk.isEmpty())
                    max = Math.max(max,i-stk.peek());
                else
                stk.push(i);
            } 
        }
        return max;
    }
}