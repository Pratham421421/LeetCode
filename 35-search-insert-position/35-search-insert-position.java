class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0, end=nums.length-1; 
        int index = 1;
        
        while(start<=end){
            int mid = start+(end-start)/2; //3/2=1, 5/2=2, 6/2=3
            
            if(nums[mid]==target){ //6!=7
                return mid;
            }
            else if(nums[mid]>target){
                index=mid;
                end=mid-1;
                
            }
            else{             //6<7
                start=mid+1; //4
                index=start;
            }
        }
        return index;
    }
}