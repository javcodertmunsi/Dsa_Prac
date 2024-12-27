class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[correctIndex] != nums[i]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        int[] result = new int[2];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
         return new int []{nums[index], index+1};
            }
        }
     return new int[]{-1,-1};
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i]= arr[correctIndex];
        arr[correctIndex] = temp;
    }
}