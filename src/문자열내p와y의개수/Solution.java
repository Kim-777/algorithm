package 문자열내p와y의개수;

public class Solution {
	
	// String이 가지고 있는 메서드를 사용해서 쉽게 풀 수 있습니다.
	boolean solution(String s) {
		
		boolean answer = true;
		int check = 0;
		String s2 = s.toLowerCase();
		
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)=='y') ++check;
			else if(s2.charAt(i)=='p') --check;
		}
		
		answer = (check==0)? true : false;
		return answer;
	}
}
