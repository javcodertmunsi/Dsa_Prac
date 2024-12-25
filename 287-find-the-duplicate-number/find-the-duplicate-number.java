class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[correctIndex]!= nums[i]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index =0; index<nums.length; index++){
            if(nums[index]!= index+1){
                return nums[index];
            }
        }
        return -1;
    }
    void swap(int[] arr, int i, int correctIndex){
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}