class Solution {
    public int mySqrt(int x) {
        if(x <=1){
            return x;
        }
        
        int lo = 1,hi = x;
        int ans = 1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            
            if(mid == x/mid){
                return mid;
            }
            
            if(mid >x/mid){                
                hi = mid-1;
            }else{
                ans = mid;
                lo = mid+1;
            }
        }
        return ans;
    }
}