class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length-1];
        int save = 1;
        for(int i=1; i<=largest; i++){
            if(smallest%i==0 && largest%i==0){
                save = i;
            }
        }
        return save;
    }
}