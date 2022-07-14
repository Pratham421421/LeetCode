class Solution {
    public boolean search(int[] nums, int target) {
    Arrays.sort(nums);
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (nums[mid] < target) {
            start = mid + 1;
        }
        else if (nums[mid] > target) {
            end = mid - 1;
        }
        else {
            return true;
        }
    }
    return false;
    }
}
