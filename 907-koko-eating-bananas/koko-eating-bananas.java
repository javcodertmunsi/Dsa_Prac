class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while(l<=r){
            int mid = (l+r)/2;
            long time = 0;
            for(int p : piles){
                time+=Math.ceil((double)p/mid);
            }
            if(time<=h){
                res = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return res;
    }
}