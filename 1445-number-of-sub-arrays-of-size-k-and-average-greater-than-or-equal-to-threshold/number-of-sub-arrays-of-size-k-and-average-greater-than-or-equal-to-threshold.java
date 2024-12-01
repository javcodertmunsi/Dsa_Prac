class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int target = threshold * k;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        // Check if the first window meets the condition
        if (sum >= target) {
            count++;
        }
        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            sum+= arr[i]-arr[i-k];
            if(sum>=target){
                count++;
            }
        }
        // return count
        return count;

    }
}