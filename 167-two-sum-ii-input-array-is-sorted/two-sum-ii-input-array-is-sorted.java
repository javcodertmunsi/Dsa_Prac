class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int li = 0;
        int ri = numbers.length - 1;
        while(li<ri){
            if(numbers[li]+numbers[ri]<target){
                li++;
            }
            else if(numbers[li]+numbers[ri]>target){
                ri--;
            }
            else{
                return new int[]{li+1,ri+1};
            }
        }
            return null;
    }
}