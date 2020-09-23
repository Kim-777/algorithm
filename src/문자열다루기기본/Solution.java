package 문자열다루기기본;

public class Solution {

	public boolean solution(String s) {
		boolean answer = false;
		
		
		if(s.length()==4||s.length()==6) {
			for(int i=0; i<s.length();i++)  {
				if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
					answer =true;
				} else {
					answer = false;
					return answer;
				}
			}
		}
		return answer;	
	}
	
}
