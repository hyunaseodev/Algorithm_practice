class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";

        String answer = "";

        for(int i=0; i<s.length(); i++){
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if(answer.length() <= len) {
                answer = s.substring(i-(len-1)/2, i+len/2+1);
            }
        }

        return answer;
    }
    public int expandFromMiddle(String s, int left, int right) {
        if(s == null || left > right) return 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    } 
}