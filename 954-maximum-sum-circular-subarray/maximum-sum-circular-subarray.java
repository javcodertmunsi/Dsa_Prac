class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax = 0;
        int curMin = 0;
        int globMax = nums[0];
        int globMin = nums[0];
        int total = 0;
        
        for(int n : nums){
            curMax = Math.max(curMax+n,n);
            curMin = Math.min(curMin+n,n);
            total += n;
            globMax= Math.max(globMax,curMax);
            globMin = Math.min(globMin,curMin);
            
        }
        
        return globMax>0?Math.max(globMax,total-globMin):globMax;
        
    }
}