class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int L = 0;
        int R = str.length()-1;

        while(L<R){
            if(str.charAt(L)!=str.charAt(R)){
                return false;
            }
            L++;
            R--;
        }
        return true;
    }
}