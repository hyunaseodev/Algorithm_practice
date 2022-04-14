class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
                
        String forwardS = "";
        String backwardS = "";
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //[a-b],[0-9]
            if((97 <= c && c <= 122)
               || (48 <= c && c <= 57)){
                forwardS += c;
                backwardS = c + backwardS;
            }            
        }

        if(forwardS.equals(backwardS)) return true;
        else return false;
    }
}