package 문자열을정수로바꾸기;

/*
 * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
 * */
public class Solution {

	// String의 메서드 substring을 이용해서 쉽게 풀수 있습니다.
	public int solution(String s) {
		
		int answer =0;
		
		if(s.charAt(0)=='-') {
			s = s.substring(1, s.length());
			answer = -Integer.parseInt(s);
		} else {
			answer = Integer.parseInt(s);
		}
		return answer;
	}
	
}
