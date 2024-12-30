class Solution {
    public int findNumbers(int[] nums) {
                int count = 0;

        for (int n : nums) {
            if (noOfDigits(n)%2==0) {
                count++;
            }
        }
        return count;
    }
     static int noOfDigits(int n) {
        int nod = 0;
        while (n > 0) {
            n = n/10;
            nod++;
        }
        return  nod;
    }
}
