class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len =0;
        int l = 0;
        HashSet<Character>charSet = new HashSet<>();       
        for(int r =0; r<s.length(); r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            len = Math.max(r-l+1,len);
        }
        return len;
    }
}