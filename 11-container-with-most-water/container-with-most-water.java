class Solution {
    public int maxArea(int[] height) {
        int li = 0;
        int ri = height.length - 1;
        int res = 0;
        while(li<ri){
            int area = Math.min(height[li],height[ri])*(ri-li);
            res = Math.max(res,area);
            if(height[li]<height[ri]){
                li++;
            }
            else {
                ri--;
            }
        }
        return res;

    }
}