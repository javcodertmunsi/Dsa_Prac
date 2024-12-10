class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<>();
        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if(tracker.containsKey(diff)){
                return new int[]{tracker.get(diff),i};
            }
            tracker.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}