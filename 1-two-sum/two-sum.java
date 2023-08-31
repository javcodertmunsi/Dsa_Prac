class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visitedNumbers =  new HashMap<Integer,Integer>();
        int compliment = 0;
        for(int i = 0; i<nums.length; i++){
            compliment = target - nums[i];
            if(visitedNumbers.containsKey(compliment)){
                return new int[]{visitedNumbers.get(compliment),i};
            }
            visitedNumbers.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}