class Solution {
    public int removeDuplicates(int[] nums) {
        int li = 1;
        for(int ri = 1; ri<nums.length; ri++){
            if(nums[ri-1]!=nums[ri]){
                nums[li]=nums[ri];
                li++;
            }
        }
        return li;
    }
}