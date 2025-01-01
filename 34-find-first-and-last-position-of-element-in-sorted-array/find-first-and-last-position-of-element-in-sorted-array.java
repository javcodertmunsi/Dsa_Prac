class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int lo = 0;
        int hi = nums.length - 1;
        int fi = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (target < nums[mid]) {
                hi = mid - 1;
            } else if (target > nums[mid]) {
                lo = mid + 1;
            } else {
                fi = mid;
                hi = mid - 1;
            }
        }

        int low = 0;
        int high = nums.length - 1;
        int li = -1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (target < nums[middle]) {
                high = middle - 1;
            } else if (target > nums[middle]) {
                low = middle + 1;
            } else {
                li = middle;
                low = middle + 1;
            }
        }
        res[0] = fi;
        res[1] = li;
    return res;
    }
}