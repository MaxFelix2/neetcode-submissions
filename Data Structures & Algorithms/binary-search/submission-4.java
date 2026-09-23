class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        if(right < left) {
            return -1;
        }
        int middle = left + (right-left)/2;
        if(nums[middle] == target) {
            return middle;
        }
        if(nums[middle] > target) {
            return binarySearch(nums, target, left, middle-1);
        }
        if(nums[middle] < target) {
            return binarySearch(nums, target, middle+1, right);
        }
        return -1;
    }
}
