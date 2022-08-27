class Solution {
    public String longestPalindrome(String s) {
      String ans = "";
        for(int i=0; i<s.length(); i++){
            String s1 = isPallindrome(s, i, i);
             String s2 = isPallindrome(s, i, i+1);
            
            if(s1.length()>ans.length()){
                ans = s1;
            }
            
            if(s2.length()>ans.length()){
                ans = s2;
            }
        }
        return ans;
    }
    public String isPallindrome(String s, int l, int r){
        while (l >= 0 && r < s.length()
            && s.charAt(l) == s.charAt(r)) {
            l--; 
            r++;
        }
    return s.substring(l + 1, r);
    }
}