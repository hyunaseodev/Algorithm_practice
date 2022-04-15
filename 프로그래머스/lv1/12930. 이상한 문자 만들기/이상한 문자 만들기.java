class Solution {
    public String solution(String s) {
        String answer = "";
        
        int idx = 0;
		for(int i = 0; i < s.length(); i++) {
			String substr = s.substring(i, i+1);
			
			if(!substr.equals(" ")) {
				if(idx % 2 == 0) {
					answer += substr.toUpperCase();
				}
				else {
					answer += substr.toLowerCase();
				}
				idx++;
			}
			else {
				answer += " ";
				idx = 0;
			}
		}
        
        return answer;
    }
}