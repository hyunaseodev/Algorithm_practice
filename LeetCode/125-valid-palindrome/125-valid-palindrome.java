class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
                
        String removedS = "";
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //[a-b],[0-9]
            if((97 <= c && c <= 122)
               || (48 <= c && c <= 57)){
                removedS += c;
            }            
        }

        int len = removedS.length();
        
        for(int i=0 ; i < len/2; i++){
            if(removedS.charAt(i) != removedS.charAt(len-i-1)) return false;
        }
        
        return true;
    }
}