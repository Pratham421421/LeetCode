class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;//
        while(left < right-1){ //0<=6
            int mid = left + (right-left)/2; //4
            if(nums[mid] == target){ 
                return mid;
            } 
            else if(nums[left] < nums[mid]){ //0<1
                if(nums[left] <= target && nums[mid] > target){ //0<=0 , 1>0
                    right = mid-1;//4
                } else {
                    left = mid+1; //4
                }
            } else {
                if(nums[mid] < target && nums[right] >= target){
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        if(nums[left] == target){
            return left;
        } else if(nums[right] == target){
            return right;
        }
        return -1;
        
    }
}

// while(left < right-1){
//             int mid = left + (right-left)/2;
//             if(nums[mid] == target){
//                 return mid;
//             } 
//             if(nums[left] < nums[mid]){
//                 if(nums[left] <= target && nums[mid] > target){
//                     right = mid-1;
//                 } else {
//                     left = mid+1;
//                 }
//             } else {
//                 if(nums[mid] < target && nums[right] >= target){
//                     left = mid+1;
//                 } else {
//                     right = mid-1;
//                 }
//             }
//         }
//         if(nums[left] == target){
//             return left;
//         } else if(nums[right] == target){
//             return right;
//         }