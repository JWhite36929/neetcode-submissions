class Solution {
    public int search(int[] nums, int target) {
        return binary_search(0, nums.length - 1, nums, target);
    }

    public int binary_search(int left, int right, int[] nums, int target){
        if (left > right) return -1;

        //avoids integer overflow since right - left is always <= nums length
        //not needed for this problem due to contraints but still best practice
        int middle = left + (right - left) / 2;

        if (nums[middle] == target) return middle;
        
        if (nums[middle] < target){
            return binary_search(middle + 1, right, nums, target);
        } else {
            return binary_search(left, middle - 1, nums, target);
        }
    }
}
