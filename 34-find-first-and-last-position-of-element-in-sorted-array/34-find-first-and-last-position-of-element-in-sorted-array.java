class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        boolean firstFound = false, lastFound=false;
       for(int i=0; i<nums.length; i++){
           if(nums[i]==target){
               arr[0]=i;
               firstFound =true;
               break;
           }
       }
        for(int i=nums.length-1; i>=arr[0]; i--){
           if(nums[i]==target){
               arr[1]=i;
               lastFound = true;
               break;
           }
       }
        if(firstFound==false){
            arr[0]=-1;
        }
        if(lastFound==false){
            arr[1]=-1;
        }
        
        return(arr);
    }
}