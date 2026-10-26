class Solution {
    public int search(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == nums[mid])
                return mid;
            // Check if left half is sorted
            if (nums[mid] >= nums[st]) {
                // Check if target lies in left half
                if (target >= nums[st] && target < nums[mid])
                    end = mid - 1;
                else
                    st = mid + 1;
            }
            else {
                // Check if target lies in right half
                if (target > nums[mid] && target <= nums[end])
                    st = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}